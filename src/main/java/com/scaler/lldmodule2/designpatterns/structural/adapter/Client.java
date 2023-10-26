package com.scaler.lldmodule2.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        // PhonePe using YesBank APIs.
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        phonePe.showAccountDetails("12345678901");
        phonePe.showBalance("12345678901");

        System.out.println("\n");

        // PhonePe using ICICIBank APIs.
        phonePe = new PhonePe(new ICICIBankAPIAdapter());
        phonePe.showAccountDetails("12345678902");
        phonePe.showBalance("12345678902");
    }
}
