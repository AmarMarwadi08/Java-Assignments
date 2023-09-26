// Interface for Shape
interface Shape {
    double area();
}

// Interface for Color
interface Color {
    String getColor();
}

// Concrete class Circle implementing both Shape and Color
class Circle implements Shape, Color {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Color of Circle: " + circle.getColor());
    }
}