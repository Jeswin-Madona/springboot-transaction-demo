package com.example.banktransaction.service;

import com.example.banktransaction.entity.Account;
import com.example.banktransaction.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private AccountRepository repo;

    @Transactional
    public void transferMoney(
            Long fromId,
            Long toId,
            double amount
    ) {

        Account from =
                repo.findById(fromId)
                        .orElseThrow();

        Account to =
                repo.findById(toId)
                        .orElseThrow();

        // Deduct money from sender
        from.setBalance(
                from.getBalance() - amount
        );

        repo.save(from);

        // Force exception for rollback
        if (true) {
            throw new RuntimeException(
                    "Transaction Failed!"
            );
        }

        // Add money to receiver
        to.setBalance(
                to.getBalance() + amount
        );

        repo.save(to);
    }
}