package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unused")
class Quack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("Quack");
    }

}