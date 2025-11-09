package observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ThirdPartyDisplay implements Observer, DisplayElement {

    ThirdPartyDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        log.info("I'm just a third party display, I don't know what to do with these weather measurements.");
    }

}