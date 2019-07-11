package com.exchange.assignment.repository;

import com.exchange.assignment.model.ParentOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentOrderRepository extends CrudRepository<ParentOrder, Long> {
    List<ParentOrder> findAllBySymbol(String symbol);
}
