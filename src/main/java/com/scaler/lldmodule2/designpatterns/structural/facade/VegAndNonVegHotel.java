package com.scaler.lldmodule2.designpatterns.structural.facade;

public class VegAndNonVegHotel implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegAndNonVegMenu();
    }
}
