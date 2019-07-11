package com.exchange.assignment.controller;

import com.exchange.assignment.model.ExecutionReport;
import com.exchange.assignment.service.ExecutionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExecutionReportController {

    @Autowired
    private ExecutionReportService executionReportService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/exchange/executionReport/{symbol}", method = RequestMethod.GET)
    public List<ExecutionReport> getExecutionReports(@PathVariable("symbol") String symbol) {
        return executionReportService.getExecutionReports(symbol);
    }

}

