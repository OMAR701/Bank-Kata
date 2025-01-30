package com.bank.domain;


import com.omar.domain.Transaction;
import com.omar.domain.TransactionRepository;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionRepositoryTest {

    @Test
    void shouldStoreTransactions() {
        TransactionRepository repository = new TransactionRepository();
        repository.addTransaction(1000);
        repository.addTransaction(-500);

        List<Transaction> transactions = repository.getAllTransactions();

        assertEquals(2, transactions.size());
        assertEquals(1000, transactions.get(0).getAmount());
        assertEquals(-500, transactions.get(1).getAmount());
    }
}
