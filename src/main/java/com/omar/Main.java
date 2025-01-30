package com.omar;

import com.omar.domain.Account;
import com.omar.domain.ITransactionRepository;
import com.omar.domain.TransactionRepository;
import com.omar.infrastructure.Console;
import com.omar.infrastructure.IPrinter;
import com.omar.infrastructure.StatementPrinter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        IPrinter printer = new StatementPrinter(console);
        ITransactionRepository transactionRepository = new TransactionRepository();
        Account account = new Account(transactionRepository, printer);

        transactionRepository.addTransaction(1000, LocalDate.of(2012, 1, 10));
        transactionRepository.addTransaction(2000, LocalDate.of(2012, 1, 13));
        transactionRepository.addTransaction(-500, LocalDate.of(2012, 1, 14)); // 🔥 This must be included!

        account.printStatement();
    }
}
