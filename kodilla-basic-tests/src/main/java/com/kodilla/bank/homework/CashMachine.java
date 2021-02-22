package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private double[] payIn;
    private double[] payOut;
    private int sizeTransactions;
    private int sizePayIn;
    private int sizePayOut;

    public CashMachine() {
        this.sizeTransactions = 0;
        this.sizePayIn = 0;
        this.sizePayOut = 0;
        this.transactions = new double[0];
        this.payIn = new double[0];
        this.payOut = new double[0];
    }

    public void newTransaction(double cash) {
        this.sizeTransactions++;
        double[] newTab = new double[this.sizeTransactions];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.sizeTransactions - 1] = cash;
        this.transactions = newTab;
        if (cash > 0) {
            this.sizePayIn++;
            double[] newTab1 = new double[this.sizePayIn];
            System.arraycopy(payIn, 0, newTab1, 0, payIn.length);
            newTab1[this.sizePayIn - 1] = cash;
            this.payIn = newTab1;
        } else if (cash < 0) {
            this.sizePayOut++;
            double[] newTab1 = new double[this.sizePayOut];
            System.arraycopy(payOut, 0, newTab1, 0, payOut.length);
            newTab1[this.sizePayOut - 1] = cash;
            this.payOut = newTab1;
        }
    }

    public double getAccountBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public double getSumPayIn() {
        if (this.payIn.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.payIn.length; i++) {
            sum += this.payIn[i];
        }
        return sum;
    }

    public double getSumPayOut() {
        if (this.payOut.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.payOut.length; i++) {
            sum += this.payOut[i];
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return this.transactions.length;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double[] getPayIn() {
        return payIn;
    }

    public double[] getPayOut() {
        return payOut;
    }
}