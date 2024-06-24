# Literals and Conversions

This folder contains a Java program that demonstrates the usage of different literals, type conversions, type promotion, and arithmetic operations involving characters in Java. This serves as an introduction to handling various data types and their conversions in Java.

## Overview

The `LiteralsConversions` class includes a `main` method that performs the following actions:
1. Demonstrates different types of literals (binary, octal, decimal, hexadecimal).
2. Shows how to create readable numbers using underscores.
3. Performs type conversions between integers and doubles.
4. Demonstrates overflow and underflow behavior with type casting.
5. Explains type promotion in arithmetic operations.
6. Illustrates the usage of scientific notation.
7. Performs arithmetic operations involving characters.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `literals` package:
```java
package app.src.main.java.literals;
```

### LiteralsConversions Class

The `LiteralsConversions` class contains the `main` method, which is the entry point of the program:
```java
public class LiteralsConversions {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Binary literal (base 2):**
   ```java
   int binary = 0b1010;
   System.out.println("For base 2, this value is " + binary);
   ```

2. **Octal literal (base 8):**
   ```java
   int octal = 012;
   System.out.println("For base 8, this value is " + octal);
   ```

3. **Decimal literal (base 10):**
   ```java
   int decimal = 10;
   System.out.println("For base 10, this value is " + decimal);
   ```

4. **Hexadecimal literal (base 16):**
   ```java
   int hex = 0xA;
   System.out.println("For base 16, this value is " + hex);
   ```

5. **Readable number with underscores:**
   ```java
   int readableNumber = 1_000_000;
   System.out.println("This value is " + readableNumber);
   ```

6. **More binary and octal examples:**
   ```java
   binary = 0b1010_1010;
   System.out.println("For base 2, this value is " + binary);
   octal = 012_34;
   System.out.println("For base 8, this value is " + octal);
   ```

7. **Type conversions:**
   ```java
   int intValue = 10;
   double doubleValue = intValue;
   System.out.println("The integer value casted to double value is " + doubleValue);

   double anotherDoubleValue = 10.5;
   int anotherIntValue = (int) anotherDoubleValue;
   System.out.println("The double value casted to integer value is " + anotherIntValue);
   ```

8. **Overflow and underflow:**
   ```java
   intValue = 130;
   byte byteValue = (byte) intValue;
   System.out.println("The overflow integer value casted to byte value is " + byteValue);

   intValue = -129;
   byteValue = (byte) intValue;
   System.out.println("The underflow integer value casted to byte value is " + byteValue);
   ```

9. **Type promotion:**
   ```java
   byteValue = 10;
   intValue = 20;
   int result = byteValue + intValue;
   System.out.println("The result after type promotion is " + result);
   ```

10. **Scientific notation:**
    ```java
    double smallNumber = 1e-4;
    System.out.println("The number 0.0001 can also be assigned as " + smallNumber);
    double largeNumber = 12e10;
    System.out.println("The number 120,000,000,000 can also be assigned as " + largeNumber);
    ```

11. **Character arithmetic:**
    ```java
    char a = 'A';
    char b = (char) (a + 1);
    System.out.println("A + 1 = " + b);
    char c = (char) (b - 1);
    System.out.println("B - 1 = " + c);
    char d = (char) (a * 1);
    System.out.println("A * 1 = " + d);
    char e = (char) ((d * 2) / 2);
    System.out.println("d / 2 = " + e);
    ```

## Running the Program

To run the `LiteralsConversions` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac LiteralsConversions.java
   ```
3. Run the compiled class:
   ```sh
   java literals.LiteralsConversions
   ```
   Or in some cases you need to define the class path so you can do the following
   ```sh
   java -cp path/to/your/.class/files introduction.Introduction
   ```

You should see the following output:
```
For base 2, this value is 10
For base 8, this value is 10
For base 10, this value is 10
For base 16, this value is 10
This value is 1000000
For base 2, this value is 170
For base 8, this value is 668
The integer value casted to double value is 10.0
The double value casted to integer value is 10
The overflow integer value casted to byte value is -126
The underflow integer value casted to byte value is 127
The result after type promotion is 30
The number 0.0001 can also be assigned as 1.0E-4
The number 120,000,000,000 can also be assigned as 1.2E11
A + 1 = B
B - 1 = A
A * 1 = A
d / 2 = A
```

## Conclusion

This program provides a comprehensive overview of literals, type conversions, type promotion, and arithmetic operations involving characters in Java. It serves as a foundational reference for understanding how different data types can be manipulated and converted in Java.