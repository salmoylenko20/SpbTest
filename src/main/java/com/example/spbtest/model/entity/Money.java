package com.example.spbtest.model.entity;

import com.example.spbtest.model.enums.MoneyType;
import com.example.spbtest.model.enums.PurchaseType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@Builder
@Table(name = "money")
@AllArgsConstructor
@NoArgsConstructor
public class Money {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "money_type")
    @Enumerated(EnumType.STRING)
    private MoneyType moneyType;

    @Column(name = "purchase_type")
    @Enumerated(EnumType.STRING)
    private PurchaseType purchaseType;

}


