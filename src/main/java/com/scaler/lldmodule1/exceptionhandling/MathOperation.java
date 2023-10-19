package com.scaler.lldmodule1.exceptionhandling;

public class MathOperation {
    public int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }

        return  a/b;
    }
}
