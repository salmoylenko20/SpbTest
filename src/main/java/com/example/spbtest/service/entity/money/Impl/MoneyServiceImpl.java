package com.example.spbtest.service.entity.money.Impl;

import com.example.spbtest.model.entity.Money;
import com.example.spbtest.model.enums.PurchaseType;
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

    private void payMoney(Double buy) {
       moneyRepository.payMoney(buy);
    }

    private void bonusBank(Double bonus) {
        moneyRepository.bonusBank(bonus);
    }

    @Override
    @Transactional
    public void paymentService(PurchaseType purchaseType, Double amount) {
        if (purchaseType.equals(PurchaseType.SHOP)) {
            if (amount < 20) {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
            } else if (amount > 300) {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.3 * 100) / 100);
            } else {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
            }
        } else if (purchaseType.equals(PurchaseType.ONLINE)) {
            if (amount < 20) {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
            } else if (amount > 300) {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.3 * 100) / 100);
            } else {
                payMoney(amount);
                bonusBank((double) Math.round(amount * 0.17 * 100) / 100);
            }
        }
    }

}
