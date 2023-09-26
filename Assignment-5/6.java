class Superclass {
    int x;

    Superclass(int value) {
        x = value;
    }

    void displayValue() {
        System.out.println("Value in superclass: " + x);
    }
}

class Subclass extends Superclass {
    int y;

    Subclass(int value1, int value2) {
        super(value1); // Invoke the superclass constructor
        y = value2;
    }

    void displayValues() {
        System.out.println("Value in superclass: " + x);
        System.out.println("Value in subclass: " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass(10, 20);
        obj.displayValues();
    }
}