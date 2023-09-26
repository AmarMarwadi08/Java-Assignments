class Grandparent {
    void displayGrandparent() {
        System.out.println("I am the Grandparent.");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("I am the Parent.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("I am the Child.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayGrandparent();
        obj.displayParent();
        obj.displayChild();
    }
}