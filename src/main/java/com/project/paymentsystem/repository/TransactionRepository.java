package com.project.paymentsystem.repository;

import com.project.paymentsystem.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
