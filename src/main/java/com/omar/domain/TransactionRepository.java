package com.omar.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository implements ITransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void addTransaction(int amount) {
        transactions.add(new Transaction(LocalDate.now(), amount));
    }

    @Override
    public void addTransaction(int amount, LocalDate date) {
        transactions.add(new Transaction(date, amount));
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
}
