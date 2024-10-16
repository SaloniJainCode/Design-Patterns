package org.design.strategyDesingPattern;

public class NormalDriving implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Requires normal driving skills");
    }
}
