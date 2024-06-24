package variables;

public class Variables {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 3;
        int num2 = 9;
        int num3 = 2;
        int num4 = 12;
        int result;

        // Calculate and print the sum of num1 and num1
        System.out.println("Sum of the numbers 3 and 3 is " + (num1 + num1));

        // Calculate the product of num1 and num3
        result = num1 * num3;
        System.out.println("Multiplication of numbers 3 and 2 is " + result);

        // Calculate and print the subtraction of num2 and num1
        System.out.println("Subtraction of numbers 9 and 3 is " + (num2 - num1));

        // Calculate the division of num4 by num3
        result = num4 / num3;
        System.out.println("Division of numbers 12 and 2 is " + result);
    }
}
