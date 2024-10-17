package org.design.factoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "TRIANGLE" -> new Triangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
