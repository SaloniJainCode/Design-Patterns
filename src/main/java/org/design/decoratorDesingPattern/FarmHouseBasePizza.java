package org.design.decoratorDesingPattern;

public class FarmHouseBasePizza extends BasePizza{
    @Override
    public String getDescription() {
        return "Farm House Pizza";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
