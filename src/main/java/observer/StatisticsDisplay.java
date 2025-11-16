package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sum = 0.0F;
    private int count;
    private final WeatherData weatherData;

    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();

        sum += temperature;
        count++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        log.info("Average/Maximum/Minimum temperature = " + (sum / count) + "/" + maxTemperature + "/" + minTemperature);
    }

}