package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Quack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("Quack");
    }

}