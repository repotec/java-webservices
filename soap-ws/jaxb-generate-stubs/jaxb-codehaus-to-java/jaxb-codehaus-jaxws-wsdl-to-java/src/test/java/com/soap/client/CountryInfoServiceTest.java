package com.soap.client;

import com.soap.ws.client.countries.*;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CountryInfoServiceTest {

    CountryInfoServiceSoapType countryService;

    @BeforeAll
    public void setup() {
        CountryInfoService service = new CountryInfoService();
        countryService = service.getCountryInfoServiceSoap();
    }

    @Test
    @Order(1)
    void countryNameTest() {
        Instant start = Instant.now();

        ArrayOftCountryCodeAndName arrayOftContinent = countryService.listOfCountryNamesByCode();
        TCountryCodeAndName countryCodeAndName = arrayOftContinent.getTCountryCodeAndName().get(0);
        String countryCode = countryCodeAndName.getSISOCode();
        String countryName = countryService.countryName(countryCode);

        System.out.println("Test 1#" + Duration.between(start, Instant.now()).toMillis());

        Assertions.assertEquals(countryName, countryCodeAndName.getSName());
    }

    @Test
    @Order(2)
    void countryName_UsingFutureTest() throws ExecutionException, InterruptedException {
        Instant start = Instant.now();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> ISOCodeFuture = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return countryService.listOfCountryNamesByCode().getTCountryCodeAndName().get(0).getSISOCode();
            }
        });

        String ISOCode = ISOCodeFuture.get();

        Future<String> countryNameFuture = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return countryService.countryName(ISOCode);
            }
        });

        String countryName = countryNameFuture.get();

        System.out.println("Test 2#" + Duration.between(start, Instant.now()).toMillis());
    }

    @Test
    @Order(3)
    void countryName_UsingCompletableFutureTest() throws ExecutionException, InterruptedException {
        Instant start = Instant.now();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<String> completableFuture =
         CompletableFuture
                .supplyAsync(() -> countryService.listOfCountryNamesByCode().getTCountryCodeAndName().get(0).getSISOCode(), executor)
                .thenApply(ISOCode -> {
                    return countryService.countryName(ISOCode);
                });

        String countryName = completableFuture.get();

        System.out.println("Test 3#" + Duration.between(start, Instant.now()).toMillis());
    }


    @Test
    @Order(4)
    void countryName_UsingCompletableFutureTest2() throws ExecutionException, InterruptedException {
        Instant start = Instant.now();



        CompletableFuture<String> cf1 = CompletableFuture
                .supplyAsync(() -> countryService.listOfCountryNamesByCode().getTCountryCodeAndName().get(0).getSISOCode())
                .exceptionally((ex) -> "not-found");

        CompletableFuture<String> cf2 = cf1.thenCompose(ISOCode -> {
            if(!ISOCode.equals("not-found")) {
                // Perform additional computation based on cf1
                String countryNameResult = countryService.countryName(ISOCode);
                return CompletableFuture.completedFuture(countryNameResult);
            }else{
                return CompletableFuture.completedFuture("not-found");
            }
        });

        // Get the final result
        cf2.thenAccept(result -> System.out.println("countryName:" + result)).get();

        System.out.println("Test 4#" + Duration.between(start, Instant.now()).toMillis());
    }
}
