package org.design.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherStationObservable{
    List<WeatherObserver> observerList = new ArrayList<>();
    int currentTemp = 26;
    @Override
    public void add(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setTemp( int newTemp) {
        if(newTemp != currentTemp) {
            currentTemp = newTemp;
            notifyObservers();
        }
    }

    @Override
    public int getTemp() {
        return currentTemp;
    }
}
