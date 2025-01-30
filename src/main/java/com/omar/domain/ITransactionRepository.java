package com.omar.domain;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionRepository {
    void addTransaction(int amount);
    void addTransaction(int amount, LocalDate date);
    List<Transaction> getAllTransactions();
}
