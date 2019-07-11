package com.exchange.assignment.controller;

import com.exchange.assignment.model.Symbol;
import com.exchange.assignment.service.SymbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SymbolController {

    @Autowired
    private SymbolService symbolService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/exchange/availableSymbols", method = RequestMethod.GET)
    public List<Symbol> getSymbols() {
        return symbolService.getSymbols();
    }

}
