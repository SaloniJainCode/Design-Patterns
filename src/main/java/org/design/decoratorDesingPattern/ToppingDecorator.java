package org.design.decoratorDesingPattern;

public abstract class ToppingDecorator extends BasePizza{

    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public String getDescription(){
        return basePizza.getDescription();
    }

    @Override
    public double getCost() {
        return basePizza.getCost();
    }
}
