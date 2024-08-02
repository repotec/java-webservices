package com.order.service;

import org.apache.cxf.feature.Features;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrdersImpl implements CustomerOrdersPortType{
    private Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
    private Integer currentId = 0;
    public void init(){
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(BigInteger.valueOf(1));

        Product product = new Product();
        product.setId(BigInteger.valueOf(1));
        product.setDescription("IPhone");
        product.setQuantity(BigInteger.valueOf(3));
        order.getProduct().add(product);

        orders.add(order);

        customerOrders.put(BigInteger.valueOf(++currentId), orders);
    }

    public CustomerOrdersImpl() {
        this.init();
    }

    @Override
    public GetOrdersResponse getOrders(GetOrdersRequest request) {
        BigInteger customerId = request.getCustomerId();
        List<Order> orders = customerOrders.get(customerId);

        GetOrdersResponse response = new GetOrdersResponse();
        response.getOrder().addAll(orders);

        return response;
    }

    @Override
    public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
        BigInteger customerId = request.getCustomerId();
        Order order = new Order();
        List<Order> orders = customerOrders.get(customerId);
        orders.add(order);

        CreateOrdersResponse response = new CreateOrdersResponse();
        response.setResult(true);
        return response;
    }
}
