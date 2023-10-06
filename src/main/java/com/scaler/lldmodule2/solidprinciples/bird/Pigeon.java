package com.scaler.lldmodule2.solidprinciples.bird;

public class Pigeon extends Bird implements Flyable {
    public Pigeon() {
        super("Pigeon");
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
