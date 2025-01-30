package com.omar.infrastructure;

import com.omar.domain.Transaction;
import java.util.List;
import java.util.Collections;

public class StatementPrinter implements IPrinter {
    private final Console console;
    private static final String HEADER = "DATE | AMOUNT | BALANCE";

    public StatementPrinter(Console console) {
        this.console = console;
    }

    @Override
    public void print(List<Transaction> transactions) {
        console.printLine(HEADER);

        transactions.sort((t1, t2) -> t1.getDate().compareTo(t2.getDate()));

        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            console.printLine(format(transaction, balance));
        }

        console.printLine("Total transactions processed: " + transactions.size());
    }

    private String format(Transaction transaction, int balance) {
        return transaction.getDate() + " | " + transaction.getAmount() + " | " + balance;
    }
}
