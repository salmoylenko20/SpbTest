package com.example.spbtest.controller;

import com.example.spbtest.model.dto.MoneyDTO;
import com.example.spbtest.service.dto.moneyDTO.MoneyDTOService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
class MoneyController {

    private final MoneyDTOService moneyDTOService;

    @GetMapping("/money")
    public MoneyDTO getMoneyAmount() {
        return moneyDTOService.getMoneyDTO();
    }
}