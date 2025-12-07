package singleton;

import lombok.Getter;

@Getter
@SuppressWarnings({"unused", "squid:S6548"})
class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }

        return chocolateBoiler;
    }

    void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

}