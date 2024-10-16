package org.design.observerDesignPattern;

public interface WeatherStationObservable {
    public void add(WeatherObserver observer);
    public void remove(WeatherObserver observer);
    public void notifyObservers();
    public void setTemp(int newTemp);
    public int getTemp();
}
