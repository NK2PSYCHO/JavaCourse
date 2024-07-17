# FinalKeyword Java Project

## Overview

This project demonstrates the usage of the `final` keyword in Java. The `final` keyword can be used with classes, methods, and variables to restrict their behavior:

1. A `final` class cannot be inherited.
2. A `final` method cannot be overridden.
3. A `final` variable cannot be reassigned.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `finalkeyword` package:
```java
package finalkeyword;
```

### Final Class

The `final_class` is a class that cannot be inherited:
```java
final class final_class {}
```

### Class with Final Variable and Method

The `final_variable` class contains a final variable and a final method:
```java
class final_variable {
    // Creating the constant variable PIE
    final private double PIE = 3.14;
    
    // getPIE function will print the value of the constant variable PIE
    // Making it final so that it cannot be overridden
    public final void getPIE() {
        System.out.println("The value of the created constant is " + PIE);
    }
    
    // setPIE function to check if we can change the value of the constant variable PIE
    // setPIE will throw an error at compile time (final field cannot be assigned)
    // public void setPIE(double new_value) {
    //     PIE = new_value;
    // }
}
```

### Class Attempting to Override Final Method

The `final_method` class attempts to override the final method from `final_variable` class:
```java
class final_method extends final_variable {
    // The following method should override the method with same name
    // from the final_variable class
    // We cannot override a final method as it'll give an error at compile time
    // (Cannot override the final method)
    // public void getPIE() {
    //     System.out.println("I've overridden the method");
    // }
}
```

### Main Class

The `FinalKeyword` class contains the `main` method, which is the entry point of the program:
```java
public class FinalKeyword {
    public static void main(String[] args) {
        // Creating a reference variable for an object of final_variable class
        final_variable fin = new final_variable();
        
        // Calling the getPIE function of final_variable to print the value of PIE
        fin.getPIE();
        
        // Trying to set a new value to the constant variable PIE
        // We'll not be able to execute the following because setPIE will throw an error at compile time
        // fin.setPIE(3.14);
    }
}
```

## Running the Program

To run the `FinalKeyword` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac FinalKeyword.java
   ```
3. Run the compiled class:
   ```sh
   java finalkeyword.FinalKeyword
   ```

You should see the following output:
```
The value of the created constant is 3.14
```

## Conclusion

This program demonstrates the restrictions imposed by the `final` keyword in Java. It shows that:

1. A `final` class cannot be inherited.
2. A `final` method cannot be overridden.
3. A `final` variable cannot be reassigned.

This serves as a foundational reference for understanding how the `final` keyword can be used to enforce immutability and prevent inheritance in Java.