package com.scaler.lldmodule2.designpatterns.creational.builder;

public class InvalidParameterException extends Exception {
    public InvalidParameterException() {
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
