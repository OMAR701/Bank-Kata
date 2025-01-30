package com.bank.domain;

import com.omar.domain.Account;
import com.omar.domain.ITransactionRepository;
import com.omar.domain.TransactionRepository;
import com.omar.infrastructure.IPrinter;
import com.omar.infrastructure.StatementPrinter;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AccountTest {


    @Test
    void shouldPrintStatementContainingAllTransactions() {
        ITransactionRepository transactionRepository = mock(ITransactionRepository.class);
        IPrinter printer = mock(IPrinter.class);
        Account account = new Account(transactionRepository, printer);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();

        verify(printer).print(anyList());
    }
}
