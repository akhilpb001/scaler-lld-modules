package com.scaler.lldmodule2.designpatterns.creational.singleton.singlethreadedlazy;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
    }

    public static DBConnection createInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }

        return instance;
    }

}
