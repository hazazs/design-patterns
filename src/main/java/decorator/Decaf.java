package decorator;

@SuppressWarnings("unused")
class Decaf extends Beverage {

    Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    double cost() {
        return 1.05D;
    }

}