package org.design.strategyDesingPattern;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDriving());
    }
}
