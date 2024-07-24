# Lambda Expression Java Project

## Overview

This project demonstrates the usage of lambda expressions in Java. Lambda expressions provide a clear and concise way to represent a method using an expression. They are used primarily to define the implementation of functional interfaces, which have a single abstract method. This project includes examples of lambda expressions for various functional interfaces, showing how they can be used to simplify code.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `lambdaexpression` package:
```java
package lambdaexpression;
```

### Main Class

The `LambdaExpression` class contains the `main` method, which demonstrates how to use lambda expressions to create instances of functional interfaces:
```java
public class LambdaExpression {
    public static void main(String[] args) {
        // Creating an instance of Sayable interface using an inner class
        Sayable sayable = new Sayable() {
            @Override
            public void say() {
                // Printing "Hello World from inner class"
                System.out.println("Hello World from inner class");
            }
        };
        // Calling the say method of Sayable instance
        sayable.say();

        // Creating an instance of Greetable interface using a lambda expression
        Greetable greetable = () -> {
            // Printing "Hello World from lambda expression"
            System.out.println("Hello World from lambda expression");
        };
        // Calling the greet method of Greetable instance
        greetable.greet();

        // Creating an instance of Summable interface using a lambda expression
        Summable summable = (a, b) -> {
            // Returning the sum of two integers
            return a + b;
        };
        // Calling the sum method of Summable instance with arguments 5 and 10
        int result = summable.sum(5, 10);
        // Printing the result of the sum method
        System.out.println("Sum: " + result);
    }
}
```

### Functional Interfaces

The project defines three functional interfaces, each with a single abstract method (SAM):

1. `Sayable` Interface:
    ```java
    interface Sayable {
        // Abstract method that takes no arguments and returns void
        void say();
    }
    ```

2. `Greetable` Interface:
    ```java
    interface Greetable {
        // Abstract method that takes no arguments and returns void
        void greet();
    }
    ```

3. `Summable` Interface:
    ```java
    interface Summable {
        // Abstract method that takes two integers as arguments and returns their sum
        int sum(int a, int b);
    }
    ```

## Running the Program

To run the `LambdaExpression` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac LambdaExpression.java
   ```
3. Run the compiled class:
   ```sh
   java lambdaexpression.LambdaExpression
   ```

You should see the following output:
```
Hello World from inner class
Hello World from lambda expression
Sum: 15
```

## Conclusion

This program demonstrates the concept of lambda expressions in Java. It shows:

1. **Anonymous Inner Classes:** How to create an instance of a functional interface using an anonymous inner class.
2. **Lambda Expressions:** How to use lambda expressions to create instances of functional interfaces concisely.
3. **Functional Interfaces:** How to define and implement functional interfaces, which have a single abstract method (SAM).

This serves as a foundational reference for understanding how to use lambda expressions in Java to simplify the implementation of functional interfaces, leading to more readable and maintainable code.