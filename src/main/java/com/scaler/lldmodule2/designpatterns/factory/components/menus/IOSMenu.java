package com.scaler.lldmodule2.designpatterns.factory.components.menus;

public class IOSMenu implements Menu {
    @Override
    public void changeSize() {
        System.out.println("Changing size of ios menu.");
    }
}
