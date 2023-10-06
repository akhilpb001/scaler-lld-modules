package com.scaler.lldmodule2.solidprinciples.bird;

public class Main {

    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.eat();
        pigeon.fly();

        Eagle eagle = new Eagle(new FastFlyingBird());
        eagle.eat();
        eagle.fly();
    }

}
