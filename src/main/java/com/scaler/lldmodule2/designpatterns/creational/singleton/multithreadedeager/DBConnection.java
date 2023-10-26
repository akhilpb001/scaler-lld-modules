package com.scaler.lldmodule2.designpatterns.creational.singleton.multithreadedeager;

public class DBConnection {
    private static DBConnection instance = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection createInstance() {
        return instance;
    }

}
