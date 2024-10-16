package org.design.decoratorDesingPattern;

public class OliveTopping extends ToppingDecorator{
    public OliveTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " With Olive Topping";
    }

    @Override
    public double getCost() {
        return super.getCost()+10;
    }
}
