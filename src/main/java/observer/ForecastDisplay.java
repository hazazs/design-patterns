package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92F;
    private float lastPressure;

    ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        String message = "Forecast: ";

        if (currentPressure > lastPressure) {
            message += "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            message += "More of the same";
        } else {
            message += "Watch out for cooler, rainy weather";
        }

        log.info(message);
    }

}