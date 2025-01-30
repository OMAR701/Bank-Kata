package com.omar.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(int amount) {
        transactions.add(new Transaction(LocalDate.now(), amount));
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
