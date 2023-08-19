package com.example.spbtest.controller;

import com.example.spbtest.model.enums.PurchaseType;
import com.example.spbtest.repository.MoneyRepository;
import com.example.spbtest.service.entity.money.MoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
class PaymentController {

    private final MoneyService moneyService;


    @Transactional
    @GetMapping("/{purchaseType}/{amount}")
    public void makePayment(@PathVariable PurchaseType purchaseType, @PathVariable Double amount) {
         if (purchaseType.equals(PurchaseType.SHOP)) {
             if (amount < 20) {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
             } else if (amount > 300) {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.3 * 100) / 100);
             } else {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
             }
         } else if (purchaseType.equals(PurchaseType.ONLINE)) {
             if (amount < 20) {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.1 * 100) / 100);
             } else if (amount > 300) {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.3 * 100) / 100);
             } else {
                 moneyService.payMoney(amount);
                 moneyService.bonusBank((double) Math.round(amount * 0.17 * 100) / 100);
             }
         }
    }
}

