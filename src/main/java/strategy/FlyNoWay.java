package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I can't fly");
    }

}