# Primitive Data Types

This folder contains a Java program that demonstrates the usage of primitive data types in Java. This serves as an introduction to handling various primitive data types and understanding their properties such as size, minimum, and maximum values.

## Overview

The `PrimitiveTypes` class includes a `main` method that performs the following actions:
1. Declares variables of each primitive data type.
2. Prints the size (in bits), minimum, and maximum values for numeric types.
3. Prints the possible values for the boolean type.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `datatypes` package:
```java
package datatypes;
```

### PrimitiveTypes Class

The `PrimitiveTypes` class contains the `main` method, which is the entry point of the program:
```java
public class PrimitiveTypes {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **byte data type:**
   ```java
   byte byteVarMin = Byte.MIN_VALUE;
   byte byteVarMax = Byte.MAX_VALUE;
   System.out.println("For the datatype byte, size is " + Byte.SIZE + " bits, minimum value is "
           + byteVarMin + ", and maximum value is " + byteVarMax);
   ```

2. **short data type:**
   ```java
   short shortVarMin = Short.MIN_VALUE;
   short shortVarMax = Short.MAX_VALUE;
   System.out.println("For the datatype short, size is " + Short.SIZE + " bits, minimum value is "
           + shortVarMin + ", and maximum value is " + shortVarMax);
   ```

3. **int data type:**
   ```java
   int intVarMin = Integer.MIN_VALUE;
   int intVarMax = Integer.MAX_VALUE;
   System.out.println("For the datatype int, size is " + Integer.SIZE + " bits, minimum value is "
           + intVarMin + ", and maximum value is " + intVarMax);
   ```

4. **long data type:**
   ```java
   long longVarMin = Long.MIN_VALUE;
   long longVarMax = Long.MAX_VALUE;
   System.out.println("For the datatype long, size is " + Long.SIZE + " bits, minimum value is "
           + longVarMin + ", and maximum value is " + longVarMax);
   ```

5. **float data type:**
   ```java
   float floatVarMin = Float.MIN_VALUE;
   float floatVarMax = Float.MAX_VALUE;
   System.out.println("For the datatype float, size is " + Float.SIZE + " bits, minimum value is "
           + floatVarMin + ", and maximum value is " + floatVarMax);
   ```

6. **double data type:**
   ```java
   double doubleVarMin = Double.MIN_VALUE;
   double doubleVarMax = Double.MAX_VALUE;
   System.out.println("For the datatype double, size is " + Double.SIZE + " bits, minimum value is "
           + doubleVarMin + ", and maximum value is " + doubleVarMax);
   ```

7. **char data type:**
   ```java
   char charVarMin = Character.MIN_VALUE;
   char charVarMax = Character.MAX_VALUE;
   System.out.println("For the datatype char, size is " + Character.SIZE + " bits, minimum value is "
           + (int) charVarMin + ", and maximum value is " + (int) charVarMax);
   ```

8. **boolean data type:**
   ```java
   boolean booleanVarFalse = false;
   boolean booleanVarTrue = true;
   System.out.println("For the datatype boolean, it has two possible values: " + booleanVarFalse
           + " and " + booleanVarTrue);
   ```

## Running the Program

To run the `PrimitiveTypes` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac PrimitiveTypes.java
   ```
3. Run the compiled class:
   ```sh
   java datatypes.PrimitiveTypes
   ```

You should see the following output:
```
For the datatype byte, size is 8 bits, minimum value is -128, and maximum value is 127
For the datatype short, size is 16 bits, minimum value is -32768, and maximum value is 32767
For the datatype int, size is 32 bits, minimum value is -2147483648, and maximum value is 2147483647
For the datatype long, size is 64 bits, minimum value is -9223372036854775808, and maximum value is 9223372036854775807
For the datatype float, size is 32 bits, minimum value is 1.4E-45, and maximum value is 3.4028235E38
For the datatype double, size is 64 bits, minimum value is 4.9E-324, and maximum value is 1.7976931348623157E308
For the datatype char, size is 16 bits, minimum value is 0, and maximum value is 65535
For the datatype boolean, it has two possible values: false and true
```

## Conclusion

This program provides a comprehensive overview of primitive data types in Java, including byte, short, int, long, float, double, char, and boolean. It serves as a foundational reference for understanding the properties of these data types and how they can be used in Java programming.