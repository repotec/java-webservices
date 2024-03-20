package com.soap.client;

import com.soap.ws.client.countries.*;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductCategoryService_Test {

    CountryInfoServiceSoapType countryService;

    @BeforeAll
    public void setup() {
        CountryInfoService service = new CountryInfoService();
        countryService = service.getCountryInfoServiceSoap();
    }

    @Test
    void test1() throws ExecutionException, InterruptedException {
        Instant start = Instant.now();

        ArrayOftCountryCodeAndName arrayOftContinent = countryService.listOfCountryNamesByCode();
        TCountryCodeAndName countryCodeAndName = arrayOftContinent.getTCountryCodeAndName().get(0);
        String countryCode = countryCodeAndName.getSISOCode();
        String countryName = countryService.countryName(countryCode);

        System.out.println(Duration.between(start, Instant.now()).toMillis());

        Assertions.assertEquals(countryName, countryCodeAndName.getSName());
    }

    @Test
    void testFutrue() throws ExecutionException, InterruptedException {
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

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }

    @Test
    void testCompletableFuture()  {
        Instant start = Instant.now();

        CompletableFuture<String> countryName = CompletableFuture
                .supplyAsync(() -> countryService.listOfCountryNamesByCode().getTCountryCodeAndName().get(0).getSISOCode())
                .thenApply(ISOCode -> countryService.countryName(ISOCode));

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }
}
