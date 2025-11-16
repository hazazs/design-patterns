package decorator;

@SuppressWarnings("unused")
class DarkRoast extends Beverage {

    DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    double cost() {
        return .99D;
    }

}