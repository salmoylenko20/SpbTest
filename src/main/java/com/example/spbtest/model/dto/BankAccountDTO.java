package com.example.spbtest.model.dto;

import lombok.Builder;

@Builder
public record BankAccountDTO(
        Double bonusMoney) {
}
