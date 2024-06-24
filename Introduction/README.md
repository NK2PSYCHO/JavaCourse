# Introduction

This folder contains a simple introductory Java program that demonstrates basic arithmetic operations and prints a friendly greeting. It is designed to serve as an initial step into Java programming.

## Overview

The `Introduction` class includes a `main` method that performs the following actions:
1. Prints a friendly greeting message.
2. Performs basic arithmetic operations (addition, subtraction, multiplication, and division) and prints the results.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `introduction` package:
```java
package introduction;
```

### Introduction Class

The `Introduction` class contains the `main` method, which is the entry point of the program:
```java
public class Introduction {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Prints a friendly greeting:**
   ```java
   System.out.println("Hello World");
   ```

2. **Performs addition (3 + 3):**
   ```java
   System.out.println("Simple Operation Addition       3 + 3 is " + (3 + 3));
   ```

3. **Performs subtraction (9 - 3):**
   ```java
   System.out.println("Simple Operation Subtraction    9 - 3 is " + (9 - 3));
   ```

4. **Performs multiplication (3 * 2):**
   ```java
   System.out.println("Simple Operation Multiplication 3 * 2 is " + (3 * 2));
   ```

5. **Performs division (12 / 2):**
   ```java
   System.out.println("Simple Operation Division       12 / 2 is " + (12 / 2));
   ```

## Running the Program

To run the `Introduction` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac Introduction.java
   ```
3. Run the compiled class:
   ```sh
   java introduction.Introduction
   ```
   Or in some cases you need to define the class path so you can do the following
   ```sh
   java -cp path/to/your/.class/files introduction.Introduction
   ```

You should see the following output:
```
Hello World
Simple Operation Addition       3 + 3 is 6
Simple Operation Subtraction    9 - 3 is 6
Simple Operation Multiplication 3 * 2 is 6
Simple Operation Division       12 / 2 is 6
```

## Conclusion

This simple program serves as a gentle introduction to Java programming, illustrating how to perform basic arithmetic operations and print output to the console. It is a great starting point for those new to Java.