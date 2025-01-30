package com.omar.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(int amount, LocalDate date) {
        transactions.add(new Transaction(date, amount));
    }

    public void addTransaction(int amount) {
        addTransaction(amount, LocalDate.now());
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
