# WrapperClass Java Project

## Overview

This project demonstrates the usage of wrapper classes in Java, specifically focusing on the `Integer` wrapper class. Wrapper classes in Java provide a way to use primitive data types (like `int`, `char`, etc.) as objects. The project includes examples of autoboxing (automatic conversion of primitive types to corresponding wrapper objects) and unboxing (automatic conversion of wrapper objects to corresponding primitive types).

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `wrapperclass` package:
```java
package wrapperclass;
```

### Wrapper Class Example

The `sample_wrapper` class includes methods to demonstrate the usage of the `Integer` wrapper class:
```java
class sample_wrapper {
    // An object of wrapper class Integer
    private Integer num_var = 10;
    private int num;

    // A method to print the value in the wrapper class object
    public void print_variable() {
        System.out.println("This is the value stored in wrapper object " + num_var);
    }

    // A method to implement boxing (auto boxing) of primitive integer to wrapper class Integer
    public void primitive_boxing(int num) {
        // As we assign a variable of primitive type to wrapper class type,
        // it will "box" it into wrapper class type hence boxing,
        // and as we're not using any wrapper method it is done automatically hence auto boxing.
        num_var = num;
        System.out.println("The new value stored in wrapper object is " + num_var);
    }

    // A method to implement unboxing (auto unboxing) of wrapper class Integer to integer
    public void wrapper_unboxing() {
        // As we assign an object of wrapper class type to primitive type,
        // it will "unbox" it into the primitive type hence unboxing,
        // and as we're not using any wrapper method it is done automatically hence auto unboxing.
        num = num_var;
        System.out.println("The value in primitive type is same to that of wrapper class type " + num);
    }
}
```

### Main Class

The `WrapperClass` class contains the `main` method, which is the entry point of the program:
```java
public class WrapperClass {
    public static void main(String[] args) {
        // An integer primitive variable we will pass to be boxed by wrapper.
        int i = 5;
        // Reference variable to the class object so that we can call functions.
        sample_wrapper sw = new sample_wrapper();
        // Method is called to print the current value in wrapper object
        sw.print_variable();
        // Method is called to pass an integer primitive value and box it
        // into the wrapper class object
        sw.primitive_boxing(i);
        // Method is called to show that the wrapper class object can be unboxed 
        // into primitive type variable
        sw.wrapper_unboxing();
    }
}
```

## Running the Program

To run the `WrapperClass` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac WrapperClass.java
   ```
3. Run the compiled class:
   ```sh
   java wrapperclass.WrapperClass
   ```

You should see the following output:
```
This is the value stored in wrapper object 10
The new value stored in wrapper object is 5
The value in primitive type is same to that of wrapper class type 5
```

## Conclusion

This program demonstrates the concept of wrapper classes in Java. It shows:

1. **Autoboxing:** Automatically converting a primitive type to its corresponding wrapper class object.
2. **Unboxing:** Automatically converting a wrapper class object to its corresponding primitive type.

This serves as a foundational reference for understanding how wrapper classes work in Java and how they can be used to convert between primitive types and objects seamlessly.