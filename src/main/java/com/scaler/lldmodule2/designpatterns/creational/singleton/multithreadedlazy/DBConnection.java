package com.scaler.lldmodule2.designpatterns.creational.singleton.multithreadedlazy;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
    }

    public static DBConnection createInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }

        return instance;
    }

}
