# User Input Java Project

## Overview

This project demonstrates how to take user input in Java using two different methods: `BufferedReader` and `Scanner`. Each method has its own class (`BufferInput` and `ScannerInput`) that encapsulates the logic for taking integer, double, and string inputs from the user. The `UserInput` class contains the `main` method to demonstrate the usage of these input methods.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `userinput` package:
```java
package userinput;
```

### BufferInput Class

This class demonstrates taking user input using the `BufferedReader` class:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferInput {
    // Method to take input using BufferedReader
    public void takeInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt for and read an integer input
            System.out.print("Enter an integer: ");
            int intInput = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + intInput);

            // Prompt for and read a double input
            System.out.print("Enter a double: ");
            double doubleInput = Double.parseDouble(reader.readLine());
            System.out.println("You entered: " + doubleInput);

            // Prompt for and read a string input
            System.out.print("Enter a string: ");
            String stringInput = reader.readLine();
            System.out.println("You entered: " + stringInput);

        } catch (IOException e) {
            // Handle input/output exceptions
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle number format exceptions
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}
```

### ScannerInput Class

This class demonstrates taking user input using the `Scanner` class:
```java
import java.util.Scanner;

class ScannerInput {
    // Method to take input using Scanner
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for and read an integer input
            System.out.print("Enter an integer: ");
            int intInput = scanner.nextInt();
            System.out.println("You entered: " + intInput);

            // Prompt for and read a double input
            System.out.print("Enter a double: ");
            double doubleInput = scanner.nextDouble();
            System.out.println("You entered: " + doubleInput);

            // Consume the newline left-over
            scanner.nextLine();

            // Prompt for and read a string input
            System.out.print("Enter a string: ");
            String stringInput = scanner.nextLine();
            System.out.println("You entered: " + stringInput);
        } finally {
            // Ensure the scanner is closed to prevent resource leak
            scanner.close();
        }
    }
}
```

### Main Class

The `UserInput` class contains the `main` method, which demonstrates the usage of the above classes and their input methods:
```java
public class UserInput {
    public static void main(String[] args) {
        // Demonstrate input using BufferInput
        System.out.println("Using BufferInput:");
        BufferInput bufferInput = new BufferInput();
        bufferInput.takeInput();

        // Demonstrate input using ScannerInput
        System.out.println("\nUsing ScannerInput:");
        ScannerInput scannerInput = new ScannerInput();
        scannerInput.takeInput();
    }
}
```

## Running the Program

To run the `UserInput` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java files:
   ```sh
   javac UserInput.java
   ```
3. Run the compiled class:
   ```sh
   java userinput.UserInput
   ```

You will be prompted to enter an integer, a double, and a string. The program will then display the entered values.

## Conclusion

This project demonstrates two common ways to handle user input in Java:

1. **BufferedReader:**
   - Provides efficient reading of characters, arrays, and lines.
   - Requires handling `IOException` and `NumberFormatException`.

2. **Scanner:**
   - Provides a simple and convenient way to parse primitive types and strings using regular expressions.
   - Requires handling `NumberFormatException`.

By understanding and using these methods, you can effectively handle user input in your Java applications.