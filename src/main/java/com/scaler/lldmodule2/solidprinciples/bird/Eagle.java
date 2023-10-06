package com.scaler.lldmodule2.solidprinciples.bird;

public class Eagle extends Bird implements Flyable {
    private FastFlyable flyFast;
    public Eagle(FastFlyable flyFast) {
        super("Eagle");
        this.flyFast = flyFast;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating...");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying...");
        this.flyFast.flyFast(name);
    }
}
