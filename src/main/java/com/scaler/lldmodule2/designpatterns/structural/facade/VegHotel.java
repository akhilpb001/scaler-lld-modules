package com.scaler.lldmodule2.designpatterns.structural.facade;

public class VegHotel implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
