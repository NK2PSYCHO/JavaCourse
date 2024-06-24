# Operators Basic

This folder contains a Java program that demonstrates the usage of various operators in Java, including arithmetic, shorthand, increment/decrement, relational, and logical operators. This serves as an introduction to using operators in Java programming.

## Overview

The `OperatorsBasic` class includes a `main` method that performs the following actions:
1. Demonstrates arithmetic operations including modulo.
2. Shows the use of shorthand operators for arithmetic operations.
3. Illustrates pre and post increment/decrement operators.
4. Uses relational operators to compare values.
5. Applies logical operators to evaluate boolean expressions.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `operators` package:
```java
package app.src.main.java.operators;
```

### OperatorsBasic Class

The `OperatorsBasic` class contains the `main` method, which is the entry point of the program:
```java
public class OperatorsBasic {
    public static void main(String[] args) {
        // Code goes here
    }
}
```

### Main Method

The `main` method performs the following tasks:

1. **Variable declaration and initialization:**
   ```java
   int num1 = 7;
   int num2 = 5;
   boolean condition1 = num1 > num2;
   boolean condition2 = num1 < num2;
   ```

2. **Modulo operator:**
   ```java
   System.out.println("The remainder you get after dividing 7 with 5 is " + (num1 % num2));
   ```

3. **Shorthand operators:**
   ```java
   num1 += 2;
   System.out.println("Value of num1 after incrementing the value stored in num1 variable by 2 is " + num1);
   num1 -= 2;
   System.out.println("Value of num1 after decreasing the value stored in num1 by 2 is " + num1);
   num2 *= 2;
   System.out.println("Value of num2 after multiplying the value stored in num2 by 2 is " + num2);
   num2 /= 2;
   System.out.println("Value of num2 after dividing the value stored in num2 by 2 is " + num2);
   num1 %= 2;
   System.out.println("Value of num1 after calculating modulo of the value stored in num1 by 2 is " + num1);
   ```

4. **Pre and post increment/decrement:**
   ```java
   num1 = ++num2;
   System.out.println("Values of num1 and num2 after we assign num2 to num1 performing pre-increment are " + num1
           + " and " + num2);
   num1 = num2++;
   System.out.println("Values of num1 and num2 after we assign num2 to num1 performing post-increment are " + num1
           + " and " + num2);
   num1 = --num2;
   System.out.println("Values of num1 and num2 after we assign num2 to num1 performing pre-decrement are " + num1
           + " and " + num2);
   num1 = num2--;
   System.out.println("Values of num1 and num2 after we assign num2 to num1 performing post-decrement are " + num1
           + " and " + num2);
   ```

5. **Relational operators:**
   ```java
   System.out.println("Is the value in num1 greater than the value in num2? " + (num1 > num2));
   System.out.println("Is the value in num1 less than the value in num2? " + (num1 < num2));
   System.out.println("Is the value in num2 greater than or equal to the value in num1? " + (num2 >= num1));
   System.out.println("Is the value in num2 less than or equal to the value in num1? " + (num2 <= num1));
   System.out.println("Is the value in num1 equal to the value in num2? " + (num1 == num2));
   System.out.println("Is the value in num2 not equal to the value in num1? " + (num2 != num1));
   ```

6. **Logical operators:**
   ```java
   System.out.println("Are both conditions true? " + (condition1 && condition2));
   System.out.println("Is at least one condition true? " + (condition1 || condition2));
   System.out.println("Is the first condition not true? " + (!condition1));
   ```

## Running the Program

To run the `OperatorsBasic` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac OperatorsBasic.java
   ```
3. Run the compiled class:
   ```sh
   java operators.OperatorsBasic
   ```

You should see the following output:
```
The remainder you get after dividing 7 with 5 is 2
Value of num1 after incrementing the value stored in num1 variable by 2 is 9
Value of num1 after decreasing the value stored in num1 by 2 is 7
Value of num2 after multiplying the value stored in num2 by 2 is 10
Value of num2 after dividing the value stored in num2 by 2 is 5
Value of num1 after calculating modulo of the value stored in num1 by 2 is 1
Values of num1 and num2 after we assign num2 to num1 performing pre-increment are 6 and 6
Values of num1 and num2 after we assign num2 to num1 performing post-increment are 6 and 7
Values of num1 and num2 after we assign num2 to num1 performing pre-decrement are 6 and 6
Values of num1 and num2 after we assign num2 to num1 performing post-decrement are 6 and 5
Is the value in num1 greater than the value in num2? true
Is the value in num1 less than the value in num2? false
Is the value in num2 greater than or equal to the value in num1? false
Is the value in num2 less than or equal to the value in num1? true
Is the value in num1 equal to the value in num2? false
Is the value in num2 not equal to the value in num1? true
Are both conditions true? false
Is at least one condition true? true
Is the first condition not true? false
```

## Conclusion

This program provides a comprehensive overview of various operators in Java, including arithmetic, shorthand, increment/decrement, relational, and logical operators. It serves as a foundational reference for understanding how different operators can be used to manipulate and compare values in Java.