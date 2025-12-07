package factory;

@SuppressWarnings("unused")
class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }

}