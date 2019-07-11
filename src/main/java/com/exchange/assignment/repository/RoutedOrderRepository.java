package com.exchange.assignment.repository;

import com.exchange.assignment.model.RoutedOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoutedOrderRepository extends CrudRepository<RoutedOrder, Long> {
    List<RoutedOrder> findAllBySymbol(String symbol);
}
