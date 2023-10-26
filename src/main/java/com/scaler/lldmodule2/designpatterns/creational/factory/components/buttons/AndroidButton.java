package com.scaler.lldmodule2.designpatterns.creational.factory.components.buttons;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of android button.");
    }
}
