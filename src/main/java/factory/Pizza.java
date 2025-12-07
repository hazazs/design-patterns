package factory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clam clam;
    PizzaIngredientFactory pizzaIngredientFactory;

    abstract void prepare();

    void bake() {
        log.info("Bake for 25 minutes at 350");
    }

    void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    void box() {
        log.info("Place pizza in official PizzaStore box");
    }

}