package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sum = 0.0F;
    private int count;

    StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
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