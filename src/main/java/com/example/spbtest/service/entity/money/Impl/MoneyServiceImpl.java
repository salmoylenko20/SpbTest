package com.example.spbtest.service.entity.money.Impl;

import com.example.spbtest.model.entity.Money;
import com.example.spbtest.repository.MoneyRepository;
import com.example.spbtest.service.entity.money.MoneyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MoneyServiceImpl implements MoneyService {

    private final MoneyRepository moneyRepository;

    public MoneyServiceImpl(MoneyRepository moneyRepository) {
        this.moneyRepository = moneyRepository;
    }

    @Override
    public Money getMoney() {
        return moneyRepository.getMoney();
    }

    @Override
    @Transactional
    public void payMoney(Double buy) {
       moneyRepository.payMoney(buy);
    }

    @Override
    @Transactional
    public void bonusBank(Double bonus) {
        moneyRepository.bonusBank(bonus);
    }
}
