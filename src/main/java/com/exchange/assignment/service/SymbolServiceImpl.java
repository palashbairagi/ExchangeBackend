package com.exchange.assignment.service;

import com.exchange.assignment.model.Symbol;
import com.exchange.assignment.repository.SymbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymbolServiceImpl implements SymbolService {

    @Autowired
    private SymbolRepository symbolRepository;

    @Override
    public List<Symbol> getSymbols() {
        return symbolRepository.findAll();
    }
}
