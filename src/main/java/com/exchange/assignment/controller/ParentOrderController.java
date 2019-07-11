package com.exchange.assignment.controller;

import com.exchange.assignment.model.ParentOrder;
import com.exchange.assignment.service.ParentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParentOrderController {

    @Autowired
    ParentOrderService parentOrderService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/exchange/parent/{symbol}", method = RequestMethod.GET)
    public List<ParentOrder> getParentOrders(@PathVariable("symbol") String symbol) {
        return parentOrderService.getParentOrders(symbol);
    }
}
