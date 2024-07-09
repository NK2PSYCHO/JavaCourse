# ClassesAndObjects

This folder contains a Java program that demonstrates the usage of classes and objects in Java. The program includes a simple `Calculator` class with methods to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Overview

The `ClassesAndObjects` class includes a `main` method that creates an instance of the `Calculator` class and uses it to perform various calculations. The `Calculator` class contains methods to add, subtract, multiply, and divide two numbers.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `classesandobjects` package:
```java
package classesandobjects;
```

### Calculator Class

The `Calculator` class contains methods to perform basic arithmetic operations:

1. **Addition:**
   ```java
   double add(double num1, double num2) {
       return num1 + num2;
   }
   ```

2. **Subtraction:**
   ```java
   double subtract(double num1, double num2) {
       return num1 - num2;
   }
   ```

3. **Multiplication:**
   ```java
   double multiply(double num1, double num2) {
       return num1 * num2;
   }
   ```

4. **Division:**
   ```java
   double divide(double num1, double num2) {
       if (num2 != 0) {
           return num1 / num2;
       } else {
           System.out.println("Error: Division by zero!"); // Print an error message
           return Double.NaN; // Return NaN (Not-a-Number) to indicate an invalid result
       }
   }
   ```

### ClassesAndObjects Class

The `ClassesAndObjects` class contains the `main` method, which is the entry point of the program:
```java
public class ClassesAndObjects {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(); // Create an instance of the Calculator class
        double num1 = 10.0;
        double num2 = 5.0;

        // Perform calculations and display results
        System.out.println("Addition: " + myCalculator.add(num1, num2));
        System.out.println("Subtraction: " + myCalculator.subtract(num1, num2));
        System.out.println("Multiplication: " + myCalculator.multiply(num1, num2));
        System.out.println("Division: " + myCalculator.divide(num1, num2));
    }
}
```

## Running the Program

To run the `ClassesAndObjects` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/your-username/ClassesAndObjects.git
   ```
3. Navigate to the project directory:
   ```sh
   cd ClassesAndObjects
   ```
4. Compile the Java file:
   ```sh
   javac classesandobjects/ClassesAndObjects.java
   ```
5. Run the compiled class:
   ```sh
   java classesandobjects.ClassesAndObjects
   ```

You should see the following output:
```
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0
```

## Conclusion

This program provides a comprehensive overview of how to define and use classes and objects in Java. It demonstrates the basic principles of object-oriented programming by creating a `Calculator` class with methods for arithmetic operations and using these methods in the `main` method.