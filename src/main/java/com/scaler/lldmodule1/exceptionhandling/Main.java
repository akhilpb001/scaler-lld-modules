package com.scaler.lldmodule1.exceptionhandling;

public class Main {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        try {
            System.out.println(mathOperation.divide(10, 5));
            System.out.println(mathOperation.divide(10, 0));
        } catch (DivisionByZeroException e) {
            System.err.println("divisor is zero.");
            throw new ArithmeticException();
        }
    }

}
