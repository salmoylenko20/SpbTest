package com.example.spbtest.controller;

import com.example.spbtest.model.enums.PurchaseType;
import com.example.spbtest.service.entity.money.MoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
class PaymentController {

    private final MoneyService moneyService;

    @GetMapping("/{purchaseType}/{amount}")
    public void makePayment(@PathVariable PurchaseType purchaseType, @PathVariable Double amount) {
         moneyService.paymentService(purchaseType, amount);
    }
}

