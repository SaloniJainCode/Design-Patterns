package org.design.strategyDesingPattern;

public class StrategyMain {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
