package com.exchange.assignment.controller;

import com.exchange.assignment.model.Account;
import com.exchange.assignment.repository.AccountRepository;
import com.exchange.assignment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/exchange/accounts", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }
}
