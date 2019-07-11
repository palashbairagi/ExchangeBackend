package com.exchange.assignment.controller;

import com.exchange.assignment.model.RoutedOrder;
import com.exchange.assignment.service.RoutedOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoutedOrderController {

    @Autowired
    private RoutedOrderService routedOrderService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/exchange/routedOrder/{symbol}", method = RequestMethod.GET)
    public List<RoutedOrder> getRoutedOrders(@PathVariable("symbol") String symbol) {
        return routedOrderService.getRoutedOrders(symbol);
    }

}
