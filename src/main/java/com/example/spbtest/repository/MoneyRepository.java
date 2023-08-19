package com.example.spbtest.repository;

import com.example.spbtest.model.entity.Money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends JpaRepository<Money,Long> {

    @Query(value = """
                   SELECT m
                   FROM Money m
                   """)
    Money getMoney();

    @Modifying
    @Query(value = """
                   UPDATE Money m
                   set m.amount = m.amount - :pay
                   where m.id = 1
                   """)
    void payMoney(Double pay);

    @Modifying
    @Query(value = """
                   UPDATE BankAccount ba
                   set ba.bonusMoney = ba.bonusMoney +:bonus
                   where ba.id = 1
                   """)
    void bonusBank(Double bonus);
}
