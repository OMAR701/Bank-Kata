package com.omar.infrastructure;

import com.omar.domain.Transaction;

import java.util.List;

public class StatementPrinter {

    private final Console console;
    private static final String HEADER = "DATE | AMOUNT | BALANCE";

    public StatementPrinter(Console console) {
        this.console = console;
    }

    public void print(List<Transaction> transactions) {
        console.printLine(HEADER);
        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            console.printLine(format(transaction, balance));
        }
    }

    private String format(Transaction transaction, int balance) {
        return transaction.getDate() + " | " + transaction.getAmount() + " | " + balance;
    }
}
