package com.scaler.lldmodule2.solidprinciples.bird;

public class Sparrow  extends Bird implements Flyable {
    public Sparrow() {
        super("Sparrow");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating...");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is flying...");
    }
}
