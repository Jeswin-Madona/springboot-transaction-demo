package com.example.banktransaction.controller;

import com.example.banktransaction.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private BankService service;

    @GetMapping("/transfer")
    public String transferMoney() {

        service.transferMoney(
                1L,
                2L,
                1000
        );

        return "Money Transferred";
    }
}