package com.exchange.assignment.service;

import com.exchange.assignment.model.ExecutionReport;
import com.exchange.assignment.repository.ExecutionReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionReportServiceImpl implements ExecutionReportService {

    @Autowired
    private ExecutionReportRepository executionReportRepository;

    @Override
    public List<ExecutionReport> getExecutionReports(String symbol) {
        return executionReportRepository.findAllBySymbol(symbol);
    }
}
