package org.design.strategyDesingPattern;

public class SpecialDriving implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Requires special Driving skills");
    }
}
