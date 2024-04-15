package com.springboot.bankingapp.repository;

import com.springboot.bankingapp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}
