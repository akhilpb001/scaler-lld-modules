package com.scaler.lldmodule2.solidprinciples.bird;

public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void eat();
}
