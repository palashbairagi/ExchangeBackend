package com.exchange.assignment.service;

import com.exchange.assignment.model.RoutedOrder;

import java.util.List;

public interface RoutedOrderService {
    List <RoutedOrder> getRoutedOrders(String symbols);
}
