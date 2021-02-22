package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalBalanceFromAllCashMachines() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getAccountBalance();
        }
        return sum;
    }

    public int getNumberOfPayInFromAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getPayIn().length;
        }
        return sum;
    }

    public int getNumberOfPayOutFromAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getPayOut().length;
        }
        return sum;
    }

    public double getSumOfPayInFromAllCashMachines() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getSumPayIn();
        }
        return sum;
    }

    public double getSumOfPayOutFromAllCashMachines() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getSumPayOut();
        }
        return sum;
    }

    public double getAveragePayInFromAllCashMachines() {
        double sumPayIn = 0;
        int numberPayIn = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sumPayIn += this.cashMachines[i].getSumPayIn();
            numberPayIn += this.cashMachines[i].getPayIn().length;
        }
        return sumPayIn / (double)numberPayIn;
    }

    public double getAveragePayOutFromAllCashMachines() {
        double sumPayOut = 0;
        int numberPayOut = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sumPayOut += this.cashMachines[i].getSumPayOut();
            numberPayOut += this.cashMachines[i].getPayOut().length;
        }
        return sumPayOut / (double) numberPayOut;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }
}
