package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}