package operators;

public class OperatorsBasic {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        boolean condition1 = num1 > num2;
        boolean condition2 = num1 < num2;

        // Calculate and print the remainder of num1 divided by num2
        System.out.println("The remainder you get after dividing 7 with 5 is " + (num1 % num2));

        // Increment and decrement operations
        num1 += 2; // Increment num1 by 2
        System.out.println("Value of num1 after incrementing by 2 is " + num1);
        num1 -= 2; // Decrement num1 by 2
        System.out.println("Value of num1 after decrementing by 2 is " + num1);
        num2 *= 2; // Multiply num2 by 2
        System.out.println("Value of num2 after multiplying by 2 is " + num2);
        num2 /= 2; // Divide num2 by 2
        System.out.println("Value of num2 after dividing by 2 is " + num2);
        num1 %= 2; // Calculate modulo of num1 by 2
        System.out.println("Value of num1 after calculating modulo by 2 is " + num1);

        // Pre-increment and post-increment examples
        num1 = ++num2; // Pre-increment num2 and assign to num1
        System.out.println("Values of num1 and num2 after pre-increment: " + num1 + " and " + num2);
        num1 = num2++; // Post-increment num2 and assign to num1
        System.out.println("Values of num1 and num2 after post-increment: " + num1 + " and " + num2);
        num1 = --num2; // Pre-decrement num2 and assign to num1
        System.out.println("Values of num1 and num2 after pre-decrement: " + num1 + " and " + num2);
        num1 = num2--; // Post-decrement num2 and assign to num1
        System.out.println("Values of num1 and num2 after post-decrement: " + num1 + " and " + num2);

        // Comparison operators
        System.out.println("Is the value in num1 greater than the value in num2? " + (num1 > num2));
        System.out.println("Is the value in num1 less than the value in num2? " + (num1 < num2));
        System.out.println("Is the value in num2 greater than or equal to the value in num1? " + (num2 >= num1));
        System.out.println("Is the value in num2 less than or equal to the value in num2? " + (num2 <= num1));
        System.out.println("Is the value in num1 equal to the value in num2? " + (num1 == num2));
        System.out.println("Is the value in num2 not equal to the value in num1? " + (num2 != num1));

        // Logical operators
        System.out.println("Are both conditions true? " + (condition1 && condition2));
        System.out.println("Is at least one condition true? " + (condition1 || condition2));
        System.out.println("Is the first condition not true? " + (!condition1));
    }
}
