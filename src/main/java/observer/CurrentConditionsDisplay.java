package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        display();
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}