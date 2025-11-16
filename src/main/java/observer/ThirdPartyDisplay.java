package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class ThirdPartyDisplay implements Observer, DisplayElement {

    private float temperature;
    private final WeatherData weatherData;

    ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();

        display();
    }

    @Override
    public void display() {
        log.info("I'm just a third party display, I don't know what to do with these weather measurements. " +
                "I will only display the temperature, which is " + temperature + "F degrees.");
    }

}