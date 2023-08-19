package com.example.spbtest.service.entity.money.Impl;

import com.example.spbtest.model.entity.BankAccount;
import com.example.spbtest.repository.BankAccountRepository;
import com.example.spbtest.service.entity.money.BankAccountService;
import org.springframework.stereotype.Service;

@Service
public class BankAccountImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public BankAccount getBonusMoney() {
        return bankAccountRepository.getBonusMoney();
    }
}
