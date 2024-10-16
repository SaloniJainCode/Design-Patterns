package org.design.observerDesignPattern;

public class MobileDisplay implements WeatherObserver{

    WeatherStationObservable weatherStationObservable;

    public MobileDisplay(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        System.out.println("Mobile shows weather temperature: "+weatherStationObservable.getTemp()+" degree");
    }
}
