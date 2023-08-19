package com.example.spbtest.repository;

import com.example.spbtest.model.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {

    @Query(value = """
                   SELECT b
                   FROM BankAccount b
                   """)
    BankAccount getBonusMoney();
}
