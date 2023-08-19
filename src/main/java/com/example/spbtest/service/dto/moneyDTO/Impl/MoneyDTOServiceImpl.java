package com.example.spbtest.service.dto.moneyDTO.Impl;


import com.example.spbtest.model.dto.MoneyDTO;
import com.example.spbtest.model.dto.converter.MoneyDTOConvert;

import com.example.spbtest.service.dto.moneyDTO.MoneyDTOService;
import com.example.spbtest.service.entity.money.MoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MoneyDTOServiceImpl implements MoneyDTOService {

    private final MoneyService moneyService;
    private final MoneyDTOConvert moneyDTOConvert;

    @Override
    public MoneyDTO getMoneyDTO() {
        return moneyDTOConvert.convertorMoneytoMoneyDTO(moneyService.getMoney());
    }
}
