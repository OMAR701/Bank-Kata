package com.omar.infrastructure;

import com.omar.domain.Transaction;
import java.util.List;

public interface IPrinter {
    void print(List<Transaction> transactions);
}
