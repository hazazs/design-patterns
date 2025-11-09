package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I'm flying!!");
    }

}