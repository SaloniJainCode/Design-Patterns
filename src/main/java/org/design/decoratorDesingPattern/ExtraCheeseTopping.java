package org.design.decoratorDesingPattern;

public class ExtraCheeseTopping extends ToppingDecorator{

    public ExtraCheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " With extra cheese";
    }

    @Override
    public double getCost() {
        return super.getCost()+30;
    }
}
