package com.bank.domain;

import com.omar.domain.Account;
import com.omar.domain.TransactionRepository;
import com.omar.infrastructure.StatementPrinter;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AccountTest {


    @Test
    void shouldPrintStatementContainingAllTransactions() {
        TransactionRepository transactionRepository = mock(TransactionRepository.class);
        StatementPrinter statementPrinter = mock(StatementPrinter.class);
        Account account = new Account(transactionRepository, statementPrinter);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();

        verify(statementPrinter).print(anyList());
    }
}
