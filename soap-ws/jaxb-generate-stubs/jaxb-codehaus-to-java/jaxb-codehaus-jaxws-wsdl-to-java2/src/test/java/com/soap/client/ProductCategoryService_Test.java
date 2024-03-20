package com.soap.client;

import com.soap.ws.client.product.Product;
import com.soap.ws.client.product.ProductCategoryService;
import com.soap.ws.client.product.ProductCategoryServicePortType;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import org.junit.jupiter.api.*;

import javax.xml.ws.BindingProvider;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductCategoryService_Test {

    ProductCategoryService fra_worklist_service;

    @BeforeAll
    public void setup() {
        fra_worklist_service = new ProductCategoryService();
    }

    /**
     * author: Ahmed Abdelfattah
     * date: 12/5/2018
     * desc FRA
     */
    @Test
    @Order(123)
    void testTimeout() {
        Instant start = Instant.now();
        ProductCategoryServicePortType servicePort = fra_worklist_service.getProductCategoryServicePort();

        Map requestContext = ((BindingProvider) servicePort).getRequestContext();
        requestContext.put(JAXWSProperties.CONNECT_TIMEOUT, 100000);
        requestContext.put(JAXWSProperties.REQUEST_TIMEOUT, 100000);

        List<Product> products = servicePort.getProducts();
        products.forEach(System.out::println);

        System.out.println(Duration.between(start, Instant.now()).toMillis());
    }












}
