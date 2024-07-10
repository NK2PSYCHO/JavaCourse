# MethodOverloading

This folder contains a Java program that demonstrates the concept of method overloading in Java. The program includes an `AreaCalculator` class with overloaded `calculateArea` methods to calculate the area of different geometric shapes: rectangles, circles, and triangles.

## Overview

The `MethodOverloading` class includes a `main` method that creates an instance of the `AreaCalculator` class and uses its overloaded methods to calculate the areas of various shapes.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `methodoverloading` package:
```java
package methodoverloading;
```

### AreaCalculator Class

The `AreaCalculator` class contains overloaded methods to calculate the area of different shapes:

1. **Area of a Rectangle:**
   ```java
   public double calculateArea(double width, double length) {
       return width * length;
   }
   ```

2. **Area of a Circle:**
   ```java
   public double calculateArea(double radius) {
       return Math.PI * radius * radius;
   }
   ```

3. **Area of a Triangle using Heron's Formula:**
   ```java
   public double calculateArea(double a, double b, double c) {
       double s = (a + b + c) / 2; // Calculate the semi-perimeter
       return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
   }
   ```

### MethodOverloading Class

The `MethodOverloading` class contains the `main` method, which is the entry point of the program:
```java
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
```

## Running the Program

To run the `MethodOverloading` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/your-username/MethodOverloading.git
   ```
3. Navigate to the project directory:
   ```sh
   cd MethodOverloading
   ```
4. Compile the Java file:
   ```sh
   javac methodoverloading/MethodOverloading.java
   ```
5. Run the compiled class:
   ```sh
   java methodoverloading.MethodOverloading
   ```

You should see the following output:
```
Rectangle area: 40.0
Circle area: 28.274333882308138
Triangle area: 6.0
```

## Conclusion

This program provides a comprehensive overview of method overloading in Java. By defining multiple `calculateArea` methods with different parameter lists, the `AreaCalculator` class can compute the area of rectangles, circles, and triangles, demonstrating the flexibility and power of method overloading.