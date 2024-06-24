# Variables

This folder contains a Java program that demonstrates the basics of Java variables, including declaration, initialization, and usage in arithmetic operations. This serves as an introduction to handling variables in Java.

## Overview

The `Variables` class includes a `main` method that performs the following actions:
1. Declares and initializes integer variables.
2. Performs basic arithmetic operations (addition, subtraction, multiplication, and division) using these variables.
3. Prints the results of these operations to the console.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `variables` package:
```java
package variables;
```

### Variables Class

The `Variables` class contains the `main` method, which is the entry point of the program:
```java
public class Variables {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Declare and initialize variables:**
   ```java
   int num1 = 3;
   int num2 = 9;
   int num3 = 2;
   int num4 = 12;
   int result;
   ```

2. **Calculate and print the sum of `num1` and `num1`:**
   ```java
   System.out.println("Sum of the numbers 3 and 3 is " + (num1 + num1));
   ```

3. **Calculate the product of `num1` and `num3` and store the result in `result`:**
   ```java
   result = num1 * num3;
   System.out.println("Multiplication of numbers 3 and 2 is " + result);
   ```

4. **Calculate and print the subtraction of `num2` and `num1`:**
   ```java
   System.out.println("Subtraction of numbers 9 and 3 is " + (num2 - num1));
   ```

5. **Calculate the division of `num4` by `num3` and store the result in `result`:**
   ```java
   result = num4 / num3;
   System.out.println("Division of numbers 12 and 2 is " + result);
   ```

## Running the Program

To run the `Variables` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac Variables.java
   ```
3. Run the compiled class:
   ```sh
   java variables.Variables
   ```
   Or in some cases you need to define the class path so you can do the following
   ```sh
   java -cp path/to/your/.class/files introduction.Introduction
   ```

You should see the following output:
```
Sum of the numbers 3 and 3 is 6
Multiplication of numbers 3 and 2 is 6
Subtraction of numbers 9 and 3 is 6
Division of numbers 12 and 2 is 6
```

## Conclusion

This simple program serves as an introduction to Java variables, illustrating how to declare, initialize, and use them in arithmetic operations. It is a great starting point for understanding how variables work in Java.