package org.design.decoratorDesingPattern;

public class DecoratorMain {
    public static void main(String[] args) {

        BasePizza pizza =  new OliveTopping(new ExtraCheeseTopping(new VegDelightBasePizza()));
        System.out.println(pizza.getDescription());
        System.out.println("Total cost: "+pizza.getCost()+"Rs only");
    }
}
