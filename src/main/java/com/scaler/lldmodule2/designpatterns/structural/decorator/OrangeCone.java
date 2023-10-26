package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class OrangeCone implements IceCream {
    private IceCream ic;

    public OrangeCone() {
    }

    public OrangeCone(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        if (ic == null) {
            return 10;
        }

        return ic.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if (ic == null) {
            return "OrangeCone::getDescription()";
        }
        return ic.getDescription() +  " -> OrangeCone::getDescription()";
    }
}
