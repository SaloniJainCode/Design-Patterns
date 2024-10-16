package org.design.observerDesignPattern;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable = new WeatherStationObservableImpl();

        WeatherObserver tvObserver = new TvDisplay(weatherStationObservable);
        WeatherObserver mobileObserver = new MobileDisplay(weatherStationObservable);

        weatherStationObservable.add(tvObserver);
        weatherStationObservable.add(mobileObserver);

        weatherStationObservable.setTemp(37);
    }
}
