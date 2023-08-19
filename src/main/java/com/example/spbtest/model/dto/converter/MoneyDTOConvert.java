package com.example.spbtest.model.dto.converter;


import com.example.spbtest.model.dto.BankAccountDTO;
import com.example.spbtest.model.dto.MoneyDTO;
import com.example.spbtest.model.entity.BankAccount;
import com.example.spbtest.model.entity.Money;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class MoneyDTOConvert {
    public MoneyDTO convertorMoneytoMoneyDTO(Money money) {
        return MoneyDTO.builder()
                        .amount(money.getAmount())
                        .moneyType(money.getMoneyType())
                        .purchaseType(money.getPurchaseType())
                .build();
    }

    public BankAccountDTO convertBankAccountToBankAccountDTO(BankAccount bankAccount) {
        return BankAccountDTO.builder()
                .bonusMoney(bankAccount.getBonusMoney())
                .build();
    }
}
