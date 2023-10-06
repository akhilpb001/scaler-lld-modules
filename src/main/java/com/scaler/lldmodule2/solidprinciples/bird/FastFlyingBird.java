package com.scaler.lldmodule2.solidprinciples.bird;

public class FastFlyingBird implements FastFlyable {
    @Override
    public void flyFast(String name) {
        System.out.println(name + " is flying fast...");
    }
}
