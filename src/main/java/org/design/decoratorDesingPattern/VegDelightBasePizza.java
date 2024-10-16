package org.design.decoratorDesingPattern;

public class VegDelightBasePizza extends BasePizza{
    @Override
    public String getDescription() {
        return "VegDelight Pizza";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
