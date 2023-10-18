package com.scaler.lldmodule2.designpatterns.factory.components.buttons;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of ios button.");
    }
}
