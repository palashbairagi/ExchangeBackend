package com.exchange.assignment.repository;

import com.exchange.assignment.model.ExecutionReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExecutionReportRepository extends CrudRepository<ExecutionReport, Long> {
    List<ExecutionReport> findAllBySymbol(String symbol);
}
