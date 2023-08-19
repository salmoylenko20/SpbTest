package com.example.spbtest.service.entity.money;


import com.example.spbtest.model.entity.Money;
import org.springframework.stereotype.Service;

@Service
public interface MoneyService {

    Money getMoney();

    void payMoney(Double buy);

    void bonusBank(Double bonus);
}
