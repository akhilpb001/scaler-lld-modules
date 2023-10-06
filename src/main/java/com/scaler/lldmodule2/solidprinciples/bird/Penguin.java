package com.scaler.lldmodule2.solidprinciples.bird;

public class Penguin extends Bird implements Dancer {
    public Penguin() {
        super("Penguin");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }

    @Override
    public void dance() {
        System.out.println(this.name + " is dancing...");
    }
}
