package org.design.decoratorDesingPattern;

public class MegharetaBasePizza extends BasePizza{
    @Override
    public String getDescription() {
        return "Meghareta Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
