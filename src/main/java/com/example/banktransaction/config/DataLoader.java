package com.example.banktransaction.config;

import com.example.banktransaction.entity.Account;
import com.example.banktransaction.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader
        implements CommandLineRunner {

    @Autowired
    private AccountRepository repo;

    @Override
    public void run(String... args)
            throws Exception {

        repo.save(
                new Account(
                        null,
                        "John",
                        5000
                )
        );

        repo.save(
                new Account(
                        null,
                        "David",
                        2000
                )
        );
    }
}
