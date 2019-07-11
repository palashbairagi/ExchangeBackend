package com.exchange.assignment.service;

import com.exchange.assignment.model.ExecutionReport;

import java.util.List;

public interface ExecutionReportService {
    List <ExecutionReport> getExecutionReports(String symbol);
}
