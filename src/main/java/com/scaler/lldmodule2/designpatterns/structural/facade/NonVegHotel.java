package com.scaler.lldmodule2.designpatterns.structural.facade;

public class NonVegHotel implements Hotel {
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
