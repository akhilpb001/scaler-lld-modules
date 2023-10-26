package com.scaler.lldmodule2.designpatterns.structural.decorator;

public class ChocoSyrup implements IceCream {
    private IceCream ic;

    public ChocoSyrup(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " -> ChocoSyrup::getDescription()";
    }
}
