package com.scaler.lldmodule2.designpatterns.structural.adapter;

public interface BankAPIAdapter {
    double getBalance(String accountNumber);
    boolean sendMoney(String fromAccountNumber, String toAccountNumber, double amount);
    void printAccountDetails(String accountNumber);
}
