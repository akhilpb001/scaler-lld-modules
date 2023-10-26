package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class ChocoScoop implements IceCream {
    private IceCream ic;

    public ChocoScoop(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " -> ChocoScoop::getDescription()";
    }
}
