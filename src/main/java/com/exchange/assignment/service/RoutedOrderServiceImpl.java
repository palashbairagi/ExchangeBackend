package com.exchange.assignment.service;

import com.exchange.assignment.model.RoutedOrder;
import com.exchange.assignment.repository.RoutedOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutedOrderServiceImpl implements RoutedOrderService {

    @Autowired
    private RoutedOrderRepository routedOrderRepository;

    @Override
    public List<RoutedOrder> getRoutedOrders(String symbols) {
        return routedOrderRepository.findAllBySymbol(symbols);
    }
}
