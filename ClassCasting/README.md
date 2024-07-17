# ClassCasting Java Project

## Overview

This project demonstrates the concept of class casting in Java, specifically upcasting and downcasting. It includes the usage of superclass and subclass relationships, and how objects and reference variables interact in these contexts.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `classcasting` package:
```java
package classcasting;
```

### Superclass

The `super_class` is a class that provides a method to indicate it is the superclass:
```java
class super_class {
    // Declaring a function that tells that we're in super class
    public void super_function() {
        System.out.println("We're in super class");
    }
}
```

### Subclass

The `sub_class` extends `super_class` and provides an additional method to indicate it is the subclass:
```java
class sub_class extends super_class {
    // Declaring a function that tells that we're in sub class
    public void sub_function() {
        System.out.println("We're in sub class");
    }
}
```

### Main Class

The `ClassCasting` class contains the `main` method, which is the entry point of the program:
```java
public class ClassCasting {
    public static void main(String[] args) {
        // Creating a variable of super class and
        // assigning it the object of sub class also
        // known as upcasting
        super_class var = new sub_class();
        
        // Note that you cannot do the reverse, assigning an object of 
        // super class to the reference variable of sub class it will throw
        // an error at compile time (Type mismatch cannot convert super to sub)
        // sub_class var_teach = new super_class();
        
        // As the functions are inherited as well we can 
        // call the function of super class with the 
        // reference variable of super class and object of sub class
        var.super_function();
        // As the reference variable is of type super class which has
        // no idea that the sub class exists, even having the object of
        // sub class we cannot call the function from it as it'll throw 
        // an error at compile time (The method is undefined for the type
        // super class)
        // var.sub_function();
        
        // What we can do is typecast the reference variable of super class
        // to that of subclass what it'll do is create a reference variable 
        // for sub class and type cast the reference variable of super class 
        // into it also known as downcasting.
        sub_class var_sub = (sub_class) var;
        // Now as the reference variable is also of type sub class similar 
        // to the object we can call both the functions from super and sub class
        var_sub.super_function();
        var_sub.sub_function();
    }
}
```

## Running the Program

To run the `ClassCasting` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac ClassCasting.java
   ```
3. Run the compiled class:
   ```sh
   java classcasting.ClassCasting
   ```

You should see the following output:
```
We're in super class
We're in super class
We're in sub class
```

## Conclusion

This program demonstrates the concept of class casting in Java. It shows:

1. **Upcasting:** Assigning a subclass object to a superclass reference variable.
2. **Downcasting:** Casting a superclass reference variable back to a subclass reference variable.

This serves as a foundational reference for understanding how class casting works in Java and how it allows for flexible use of superclass and subclass relationships.