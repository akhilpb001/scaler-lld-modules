package com.scaler.lldmodule2.designpatterns.structural.facade;

public class HotelHelper {
    private VegHotel vegHotel;
    private NonVegHotel nonVegHotel;
    private VegAndNonVegHotel vegAndNonVegHotel;

    public HotelHelper() {
        vegHotel = new VegHotel();
        nonVegHotel = new NonVegHotel();
        vegAndNonVegHotel = new VegAndNonVegHotel();
    }

    public VegMenu getVegMenu() {
        return (VegMenu) vegHotel.getMenu();
    }

    public NonVegMenu getNonVegMenu() {
        return (NonVegMenu) nonVegHotel.getMenu();
    }

    public VegAndNonVegMenu getVegAndNonVegMenu() {
        return (VegAndNonVegMenu) vegAndNonVegHotel.getMenu();
    }
}
