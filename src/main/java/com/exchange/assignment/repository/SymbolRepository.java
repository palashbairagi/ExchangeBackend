package com.exchange.assignment.repository;

import java.util.List;
import com.exchange.assignment.model.Symbol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolRepository extends CrudRepository<Symbol, Long> {
    List<Symbol> findAll();
}
