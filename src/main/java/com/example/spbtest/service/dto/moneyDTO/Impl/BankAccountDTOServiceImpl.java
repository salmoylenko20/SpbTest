package com.example.spbtest.service.dto.moneyDTO.Impl;

import com.example.spbtest.model.dto.BankAccountDTO;
import com.example.spbtest.model.dto.converter.MoneyDTOConvert;
import com.example.spbtest.service.dto.moneyDTO.BankAccountDTOService;
import com.example.spbtest.service.entity.money.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankAccountDTOServiceImpl implements BankAccountDTOService {

    private final BankAccountService bankAccountService;
    private final MoneyDTOConvert moneyDTOConvert;

    @Override
    public BankAccountDTO getBonusMoney() {
        return moneyDTOConvert.convertBankAccountToBankAccountDTO(bankAccountService.getBonusMoney());
    }
}
