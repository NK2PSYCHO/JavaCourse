package classesandobjects;

class Calculator {
    // Method to add two numbers
    double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero!"); // Print an error message
            return Double.NaN; // Return NaN (Not-a-Number) to indicate an invalid result
        }
    }
}

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
