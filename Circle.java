package GuviJavaPractices3;

public class Circle {
    private double radius;
    public Circle() {
        // Default radius is set to 1.0 if not specified
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());
        Circle circle2 = new Circle(3.5);
        System.out.println("Circle 2 - Radius: " + circle2.radius);
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}

