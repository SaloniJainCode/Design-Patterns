package org.design.strategyDesingPattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new NormalDriving());
    }
}
