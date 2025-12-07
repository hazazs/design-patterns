package factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PepperoniPizza extends Pizza {

    PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        log.info("Preparing " + name);

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }

}