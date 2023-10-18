package com.scaler.lldmodule2.designpatterns.factory.components.menus;

public class AndroidMenu implements Menu {
    @Override
    public void changeSize() {
        System.out.println("Changing size of android menu.");
    }
}
