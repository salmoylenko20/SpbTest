package com.example.spbtest.service.entity.money;


import com.example.spbtest.model.entity.Money;
import com.example.spbtest.model.enums.PurchaseType;
import org.springframework.stereotype.Service;

@Service
public interface MoneyService {

    Money getMoney();

    void paymentService(PurchaseType purchaseType, Double amount);
}
