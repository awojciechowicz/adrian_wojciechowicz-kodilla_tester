package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveTwoCashMachines() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine[] cashMachines = {cashMachine1, cashMachine2};
        Bank bank = new Bank(cashMachines);
        assertEquals(2, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddThreeBalancesOfThreeCashMachines() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.newTransaction(200);
        cashMachine1.newTransaction(900);
        cashMachine1.newTransaction(-300);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.newTransaction(400);
        cashMachine2.newTransaction(-200);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.newTransaction(1500);

        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        assertEquals(2500, bank.getTotalBalanceFromAllCashMachines());
    }

    @Test
    public void shouldAddThePayInNumberOfAllCashMachines() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.newTransaction(200);
        cashMachine1.newTransaction(900);
        cashMachine1.newTransaction(-300);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.newTransaction(400);
        cashMachine2.newTransaction(-200);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.newTransaction(1500);

        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        assertEquals(4, bank.getNumberOfPayInFromAllCashMachines());
    }

    @Test
    public void shouldAddThePayOutNumberOfAllCashMachines() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.newTransaction(200);
        cashMachine1.newTransaction(900);
        cashMachine1.newTransaction(-300);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.newTransaction(400);
        cashMachine2.newTransaction(-200);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.newTransaction(1500);

        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        assertEquals(2, bank.getNumberOfPayOutFromAllCashMachines());
    }

    @Test
    public void shouldCalculateTheAverageOfPayInNumberOfAllCashMachines() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.newTransaction(200);
        cashMachine1.newTransaction(900);
        cashMachine1.newTransaction(-300);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.newTransaction(400);
        cashMachine2.newTransaction(-200);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.newTransaction(1500);

        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        assertEquals(750, bank.getAveragePayInFromAllCashMachines(),0.01);
    }

    @Test
    public void shouldCalculateTheAverageOfPayOutNumberOfAllCashMachines() {

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.newTransaction(200);
        cashMachine1.newTransaction(900);
        cashMachine1.newTransaction(-300);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.newTransaction(400);
        cashMachine2.newTransaction(-200);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.newTransaction(1500);

        CashMachine[] cashMachines = {cashMachine1, cashMachine2, cashMachine3};

        Bank bank = new Bank(cashMachines);
        assertEquals(-250.0, bank.getAveragePayOutFromAllCashMachines(),0.01);
    }

}
