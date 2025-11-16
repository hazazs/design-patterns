package observer;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    @Getter(AccessLevel.PACKAGE)
    private float temperature;
    @Getter(AccessLevel.PACKAGE)
    private float humidity;
    @Getter(AccessLevel.PACKAGE)
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

}