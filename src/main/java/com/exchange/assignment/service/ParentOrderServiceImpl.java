package com.exchange.assignment.service;

import com.exchange.assignment.model.ParentOrder;
import com.exchange.assignment.repository.ParentOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentOrderServiceImpl implements ParentOrderService {

    @Autowired
    private ParentOrderRepository parentOrderRepository;

    @Override
    public List<ParentOrder> getParentOrders(String symbol) {
        return parentOrderRepository.findAllBySymbol(symbol);
    }
}
