package exceptionhandling;

// CustomArithematicException class
class CustomArithematicException extends Exception {
    // Constructor to initialize the exception message
    public CustomArithematicException(String message) {
        super(message);
    }
}

// PurposefulArithematicException class
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

// CollectionExceptions class
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

// IrresponsibleException class
class IrresponsibleException {

    // Method to throw CustomArithematicException for main to handle
    public void throwCustomException() throws CustomArithematicException {
        throw new CustomArithematicException("Exception thrown by IrresponsibleException.");
    }
}

// Main class to demonstrate the usage of the above classes
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
