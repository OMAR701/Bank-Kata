package com.omar.domain;

import com.omar.infrastructure.IPrinter;
import java.util.List;

public class Account {
    private final ITransactionRepository transactionRepository;
    private final IPrinter printer;

    public Account(ITransactionRepository transactionRepository, IPrinter printer) {
        this.transactionRepository = transactionRepository;
        this.printer = printer;
    }

    public void deposit(int amount) {
        transactionRepository.addTransaction(amount);
    }

    public void withdraw(int amount) {
        transactionRepository.addTransaction(-amount);
    }

    public void printStatement() {
        List<Transaction> transactions = transactionRepository.getAllTransactions();
        printer.print(transactions);
    }
}
