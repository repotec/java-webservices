package com.order.service;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint = new EndpointImpl(bus, new CustomerOrdersImpl());
        endpoint.publish("/order-service");
        return endpoint;
    }
}