package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoSyrup(
                new ChocoScoop(
                        new VanillaScoop(
                                new OrangeCone(
                                        new ChocoSyrup(
                                                new VanillaCone()
                                        )
                                )
                        )
                )
        );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
