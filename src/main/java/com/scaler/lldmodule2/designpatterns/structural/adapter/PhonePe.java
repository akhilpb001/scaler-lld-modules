package com.scaler.lldmodule2.designpatterns.structural.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void showBalance(String accountNumber) {
        System.out.println("Balance: " + bankAPI.getBalance(accountNumber));
    }

    public void showAccountDetails(String accountNumber) {
        bankAPI.printAccountDetails(accountNumber);
    }
}
