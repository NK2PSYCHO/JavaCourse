package loopingstatements;

public class LoopingStatements {
    public static void main(String[] args) {
        int n = 15; // Define the number of terms in the Fibonacci series
        int i = 2; // Initialize the loop counter
        int firstTerm = 0, secondTerm = 1; // Initialize the first two terms of the series
        int[] numbers = {1, 2, 3, 4, 5};

        // Example of enhanced for loop
        System.out.println("Example of enhanced for loop");
        for (int num : numbers) {
            System.out.println(num); // Prints each number in the array
        }

        // Generate Fibonacci series using a for loop
        System.out.println("Fibonacci Series using for loop:");
        System.out.print(firstTerm + ", " + secondTerm);
        for (; i < n; ++i) {
            int nextTerm = firstTerm + secondTerm; // Calculate the next term
            System.out.print(", " + nextTerm); // Print the next term
            firstTerm = secondTerm; // Update the first term
            secondTerm = nextTerm; // Update the second term
        }

        // Generate Fibonacci series using a while loop
        System.out.println("\nFibonacci Series using while loop:");
        i = 2; // Reset the loop counter
        firstTerm = 0; // Reset the first term
        secondTerm = 1; // Reset the second term
        System.out.print(firstTerm + ", " + secondTerm);
        while (i < n) {
            int nextTerm = firstTerm + secondTerm; // Calculate the next term
            System.out.print(", " + nextTerm); // Print the next term
            firstTerm = secondTerm; // Update the first term
            secondTerm = nextTerm; // Update the second term
            i++; // Increment the loop counter
        }

        // Execute this code block exactly once as the while loop condition is false
        do {
            System.out.println();
            System.out.println("This code block is executed exactly once as the while loop is false");
            i++; // Increment the loop counter
        } while (i < n);
    }
}
