package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class VanillaScoop implements IceCream {
    private IceCream ic;

    public VanillaScoop(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " -> VanillaScoop::getDescription()";
    }
}
