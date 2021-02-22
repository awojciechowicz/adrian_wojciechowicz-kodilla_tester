package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.newTransaction(500);
        cashMachine.newTransaction(-200);
        cashMachine.newTransaction(900);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(500, transactions[0]);
        assertEquals(-200, transactions[1]);
        assertEquals(900, transactions[2]);
    }

    @Test
    public void shouldCalculateAccountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.newTransaction(500);
        cashMachine.newTransaction(-200);
        cashMachine.newTransaction(900);
        assertEquals(1200, cashMachine.getAccountBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAccountBalance());
    }

    @Test
    public void shouldReturnThreeAsNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.newTransaction(500);
        cashMachine.newTransaction(-200);
        cashMachine.newTransaction(900);
        assertEquals(3, cashMachine.getNumberOfTransactions());
    }
}
