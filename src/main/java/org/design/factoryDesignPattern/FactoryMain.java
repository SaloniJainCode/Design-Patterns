package org.design.factoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj = shapeFactory.getShape("SQUARE");
        obj.draw();
    }
}
