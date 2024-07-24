# Exception Handling Java Project

## Overview

This project demonstrates various techniques for handling exceptions in Java. It includes custom exception handling, built-in exception handling, and methods to showcase how exceptions can be thrown and caught. The project consists of several classes that each handle different types of exceptions, providing a comprehensive example of effective exception handling in Java.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `exceptionhandling` package:
```java
package exceptionhandling;
```

### CustomArithematicException Class

This class defines a custom exception that extends the `Exception` class:
```java
class CustomArithematicException extends Exception {
    // Constructor to initialize the exception message
    public CustomArithematicException(String message) {
        super(message);
    }
}
```

### PurposefulArithematicException Class

This class contains methods to handle arithmetic exceptions, including division by zero and a custom exception for when the numerator is smaller than the denominator:
```java
class PurposefulArithematicException {
    // Method to handle divide by zero exception
    public void divide(int a, int b) {
        try {
            int result = a / b; // This might throw ArithmeticException if b is zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to throw CustomArithematicException if the number to be divided is smaller
    public void checkAndThrow(int a, int b) throws CustomArithematicException {
        if (a < b) {
            throw new CustomArithematicException("Custom Exception: The numerator is smaller than the denominator.");
        } else {
            System.out.println("No exception, valid input.");
        }
    }
}
```

### CollectionExceptions Class

This class handles common collection-related exceptions, such as null pointer exceptions for strings and array out-of-bounds exceptions:
```java
class CollectionExceptions {
    // Method to handle null pointer exception for a string
    public void handleStringNullPointer(String str) {
        try {
            System.out.println("String length: " + str.length()); // This might throw NullPointerException if str is null
        } catch (NullPointerException e) {
            System.out.println("Error: Null string encountered.");
        }
    }

    // Method to handle array out of bounds exception
    public void handleArrayOutOfBounds(int[] array, int index) {
        try {
            System.out.println("Array element at index " + index + ": " + array[index]); // This might throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }
    }
}
```

### IrresponsibleException Class

This class demonstrates how to throw a custom exception:
```java
class IrresponsibleException {
    // Method to throw CustomArithematicException for main to handle
    public void throwCustomException() throws CustomArithematicException {
        throw new CustomArithematicException("Exception thrown by IrresponsibleException.");
    }
}
```

### Main Class

The `ExceptionHandling` class contains the `main` method, which demonstrates the usage of the above classes and their exception handling methods:
```java
public class ExceptionHandling {
    public static void main(String[] args) {
        // Create instances of the classes
        PurposefulArithematicException purposefulArithematicException = new PurposefulArithematicException();
        CollectionExceptions collectionExceptions = new CollectionExceptions();
        IrresponsibleException irresponsibleException = new IrresponsibleException();

        // Handle divide by zero exception
        purposefulArithematicException.divide(10, 0);

        // Handle custom exception for smaller numerator
        try {
            purposefulArithematicException.checkAndThrow(5, 10);
        } catch (CustomArithematicException e) {
            System.out.println(e.getMessage());
        }

        // Handle string null pointer exception
        collectionExceptions.handleStringNullPointer(null);

        // Handle array out of bounds exception
        int[] array = {1, 2, 3};
        collectionExceptions.handleArrayOutOfBounds(array, 5);

        // Handle custom exception thrown by IrresponsibleException
        try {
            irresponsibleException.throwCustomException();
        } catch (CustomArithematicException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## Running the Program

To run the `ExceptionHandling` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java files:
   ```sh
   javac ExceptionHandling.java
   ```
3. Run the compiled class:
   ```sh
   java exceptionhandling.ExceptionHandling
   ```

You should see the following output:
```
Error: Division by zero is not allowed.
Custom Exception: The numerator is smaller than the denominator.
Error: Null string encountered.
Error: Index out of bounds.
Exception thrown by IrresponsibleException.
```

## Conclusion

This project demonstrates various exception handling techniques in Java, including:

1. **Arithmetic Exception Handling:** Handling division by zero and custom arithmetic exceptions.
2. **Collection Exception Handling:** Handling null pointer exceptions and array index out-of-bounds exceptions.
3. **Custom Exceptions:** Creating and using custom exceptions for specific error conditions.

By understanding and applying these techniques, you can write more robust and error-resistant Java programs.