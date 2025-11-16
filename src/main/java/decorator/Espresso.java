package decorator;

@SuppressWarnings("unused")
class Espresso extends Beverage {

    Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99D;
    }

}