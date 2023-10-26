package com.scaler.lldmodule2.designpatterns.structural.adapter;

import com.scaler.lldmodule2.designpatterns.structural.adapter.thirdparty.yesbank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccountNumber, String toAccountNumber, double amount) {
        return false;
    }

    @Override
    public void printAccountDetails(String accountNumber) {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: Yes Bank");
        System.out.println("Branch: Bangalore");
    }
}
