package org.design.observerDesignPattern;

public class TvDisplay implements WeatherObserver{

    WeatherStationObservable weatherStationObservable;

    public TvDisplay(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        System.out.println("Tv shows weather temperature: "+weatherStationObservable.getTemp()+" degree");
    }
}
