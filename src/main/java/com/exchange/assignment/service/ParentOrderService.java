package com.exchange.assignment.service;

import com.exchange.assignment.model.ParentOrder;

import java.util.List;

public interface ParentOrderService {
    List <ParentOrder> getParentOrders(String symbol);
}
