package com.example.spbtest.controller;

import com.example.spbtest.model.dto.BankAccountDTO;
import com.example.spbtest.service.dto.moneyDTO.BankAccountDTOService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
class BankAccountController {

    private final BankAccountDTOService bankAccountDTOService;


    @GetMapping("/bankAccountOfEMoney")
    public BankAccountDTO getBonusPoints() {
        return bankAccountDTOService.getBonusMoney();
    }
}
