package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class VanillaCone implements IceCream {
    private  IceCream ic;

    public VanillaCone() {
    }

    public VanillaCone(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        if (ic == null) {
            return 5;
        }

        return ic.getCost() + 5;
    }

    @Override
    public String getDescription() {
        if (ic == null) {
            return "VanillaCone::getDescription()";
        }

        return ic.getDescription() + " -> VanillaCone::getDescription()";
    }
}
