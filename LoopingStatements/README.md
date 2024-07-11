# LoopingStatements

This folder contains a Java program that demonstrates the usage of different looping constructs in Java, specifically `for`, `while`, `do-while`, and enhanced `for` loops. The program generates and prints the Fibonacci series using these loops and also showcases an example of an enhanced `for` loop.

## Overview

The `LoopingStatements` class includes a `main` method that performs the following actions:
1. Demonstrates an enhanced `for` loop to iterate through an array.
2. Generates and prints the Fibonacci series using a `for` loop.
3. Resets the loop counter and generates the Fibonacci series using a `while` loop.
4. Demonstrates a `do-while` loop that executes a specific block of code exactly once, regardless of the loop condition.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `loopingstatements` package:
```java
package loopingstatements;
```

### LoopingStatements Class

The `LoopingStatements` class contains the `main` method, which is the entry point of the program:
```java
public class LoopingStatements {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Variable declaration and initialization:**
   ```java
   int n = 15; // Define the number of terms in the Fibonacci series
   int i = 2; // Initialize the loop counter
   int firstTerm = 0, secondTerm = 1; // Initialize the first two terms of the series
   int[] numbers = {1, 2, 3, 4, 5}; // Example array for enhanced for loop
   ```

2. **Enhanced for loop:**
   ```java
   System.out.println("Example of enhanced for loop");
   for (int num : numbers) {
       System.out.println(num); // Prints each number in the array
   }
   ```

3. **For loop:**
   ```java
   System.out.println("Fibonacci Series using for loop:");
   System.out.print(firstTerm + ", " + secondTerm);

   // Generate Fibonacci series using a for loop
   for (; i < n; ++i) {
       int nextTerm = firstTerm + secondTerm; // Calculate the next term
       System.out.print(", " + nextTerm); // Print the next term
       firstTerm = secondTerm; // Update the first term
       secondTerm = nextTerm; // Update the second term
   }
   ```

4. **While loop:**
   ```java
   System.out.println("\nFibonacci Series using while loop:");
   i = 2; // Reset the loop counter
   firstTerm = 0; // Reset the first term
   secondTerm = 1; // Reset the second term

   System.out.print(firstTerm + ", " + secondTerm);

   // Generate Fibonacci series using a while loop
   while (i < n) {
       int nextTerm = firstTerm + secondTerm; // Calculate the next term
       System.out.print(", " + nextTerm); // Print the next term
       firstTerm = secondTerm; // Update the first term
       secondTerm = nextTerm; // Update the second term
       i++; // Increment the loop counter
   }
   ```

5. **Do-while loop:**
   ```java
   // Execute this code block exactly once as the while loop condition is false
   do {
       System.out.println();
       System.out.println("This code block is executed exactly once as the while loop is false");
       i++; // Increment the loop counter
   } while (i < n);
   ```

## Running the Program

To run the `LoopingStatements` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/your-username/LoopingStatements.git
   ```
3. Navigate to the project directory:
   ```sh
   cd LoopingStatements
   ```
4. Compile the Java file:
   ```sh
   javac loopingstatements/LoopingStatements.java
   ```
5. Run the compiled class:
   ```sh
   java loopingstatements/LoopingStatements
   ```

You should see the following output:
```
Example of enhanced for loop
1
2
3
4
5
Fibonacci Series using for loop:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

Fibonacci Series using while loop:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

This code block is executed exactly once as the while loop is false
```

## Conclusion

This program provides a comprehensive overview of how different looping constructs in Java (`for`, `while`, `do-while` loops, and enhanced `for` loop) can be used to generate and print the Fibonacci series and iterate through an array. It serves as a foundational reference for understanding how loops work in Java.