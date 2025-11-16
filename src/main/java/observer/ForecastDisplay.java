package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92F;
    private float lastPressure;
    private final WeatherData weatherData;

    ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

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