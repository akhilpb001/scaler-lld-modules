package com.scaler.lldmodule2.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        HotelHelper hotelHelper = new HotelHelper();
        hotelHelper.getVegMenu();
        hotelHelper.getNonVegMenu();
        hotelHelper.getVegAndNonVegMenu();
    }
}
