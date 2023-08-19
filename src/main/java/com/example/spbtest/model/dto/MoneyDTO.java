package com.example.spbtest.model.dto;

import com.example.spbtest.model.enums.MoneyType;
import com.example.spbtest.model.enums.PurchaseType;
import lombok.Builder;

@Builder
public record MoneyDTO(
        Double amount,

        MoneyType moneyType,

        PurchaseType purchaseType) {

}
