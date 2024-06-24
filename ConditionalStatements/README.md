# Conditional Statements

This folder contains a Java program that demonstrates various conditional statements in Java. This serves as an introduction to handling different conditional constructs like `if`, `else`, `else if`, the ternary operator, and `switch` statements.

## Overview

The `ConditionalStatements` class includes a `main` method that performs the following actions:
1. Demonstrates the usage of `if` statements with various conditions.
2. Shows the use of `else` and `else if` statements.
3. Utilizes the ternary operator for conditional assignments.
4. Implements a `switch` statement to handle multiple conditions.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `conditionalstatements` package:
```java
package conditionalstatements;
```

### ConditionalStatements Class

The `ConditionalStatements` class contains the `main` method, which is the entry point of the program:
```java
public class ConditionalStatements {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Simple if statements:**
   ```java
   int num = 70;
   if (num > 60)
       System.out.println("The number is greater than 60");

   if (num < 100) {
       System.out.println("The number is less than 100");
   }
   System.out.println("Message after the if block is executed");
   ```

2. **if statements with logical operators:**
   ```java
   int x = 5, y = 7;
   if (x > 3 && y < 10) {
       System.out.println("Both conditions are true");
   }

   if (y > 10 || x <= 5) {
       System.out.println("At least one condition is true");
   }

   boolean flag = false;
   if (!flag) {
       System.out.println("Flag is false");
   }
   ```

3. **if-else statements:**
   ```java
   boolean a = true;
   boolean b = false;

   if (a) {
       System.out.println("a is true");
   } else {
       System.out.println("a is false");
   }

   if (b) {
       System.out.println("b is true");
   } else {
       System.out.println("b is false");
   }
   ```

4. **Nested if-else statements:**
   ```java
   if (num >= x && num >= y) {
       if (num == x && num == y) {
           System.out.println("All numbers are equal.");
       } else if (num == x) {
           System.out.println("num and x are the largest numbers.");
       } else if (num == y) {
           System.out.println("num and y are the largest numbers.");
       } else {
           System.out.println("num is the largest number.");
       }
   } else if (x >= num && x >= y) {
       if (x == y) {
           System.out.println("x and y are the largest numbers.");
       } else {
           System.out.println("x is the largest number.");
       }
   } else {
       System.out.println("y is the largest number.");
   }
   ```

5. **Ternary operator:**
   ```java
   int result = (num > x) ? y : x;
   System.out.println("The result is: " + result);

   result = (num > 50) ? (x > y ? x : y) : 0;
   System.out.println("The result is: " + result);

   result = (num > 50) ? x : (num > 30) ? y : 0;
   System.out.println("The result is: " + result);
   ```

6. **switch statement:**
   ```java
   int day = 3;
   switch (day) {
       case 1:
           System.out.println("Monday");
           break;
       case 2:
           System.out.println("Tuesday");
           break;
       case 3:
           System.out.println("Wednesday");
           break;
       case 4:
           System.out.println("Thursday");
           break;
       case 5:
           System.out.println("Friday");
           break;
       case 6:
           System.out.println("Saturday");
           break;
       case 7:
           System.out.println("Sunday");
           break;
       default:
           System.out.println("Error! Please enter a valid day.");
           break;
   }
   ```

## Running the Program

To run the `ConditionalStatements` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac ConditionalStatements.java
   ```
3. Run the compiled class:
   ```sh
   java conditionalstatements.ConditionalStatements
   ```

You should see output demonstrating the various conditional statements and their results.

## Conclusion

This program provides a comprehensive overview of conditional statements in Java, including `if`, `else`, `else if`, the ternary operator, and `switch` statements. It serves as a foundational reference for understanding how to implement and use conditional logic in Java programming.