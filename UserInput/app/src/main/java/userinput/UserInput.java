package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Class for taking input using BufferedReader
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

// Class for taking input using Scanner
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

// Main class to demonstrate the usage of BufferInput and ScannerInput classes
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
