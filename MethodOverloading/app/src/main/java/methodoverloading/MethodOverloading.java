package methodoverloading;

// Define a class named "AreaCalculator"
class AreaCalculator {
    // Method to calculate the area of a rectangle
    public double calculateArea(double width, double length) {
        return width * length;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle using Heron's formula
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Calculate the semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }
}

// Main class
public class MethodOverloading {
    public static void main(String[] args) {
        // Create an instance of the AreaCalculator class
        AreaCalculator calculator = new AreaCalculator();

        // Calculate the area of a rectangle
        double rectangleArea = calculator.calculateArea(5.0, 8.0);
        System.out.println("Rectangle area: " + rectangleArea);

        // Calculate the area of a circle
        double circleArea = calculator.calculateArea(3.0);
        System.out.println("Circle area: " + circleArea);

        // Calculate the area of a triangle
        double triangleArea = calculator.calculateArea(3.0, 4.0, 5.0);
        System.out.println("Triangle area: " + triangleArea);
    }
}
