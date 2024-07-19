# AbstractKeyword Java Project

## Overview

This project demonstrates the usage of the `abstract` keyword in Java, which is used to define abstract classes and methods. Abstract classes serve as blueprints for other classes, allowing them to share abstractions and implementations. Abstract methods provide method signatures without implementations, requiring subclasses to implement them. This project includes examples of abstract classes, abstract methods, and how they can be inherited and implemented in Java.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `abstractkeyword` package:
```java
package abstractkeyword;
```

### Abstract Class

The `abstractor` class is an abstract class that serves as a blueprint for other classes:
```java
abstract class abstractor {
    // Abstract methods are only the definition of the methods, they do not implement anything
    // they do not have a body, any class that inherits the abstract class with the abstract method
    // needs to implement the abstract method or be declared as an abstract class itself
    public abstract void show_something();

    // Abstract methods need to be declared in an abstract class, but an abstract class does not 
    // require to have abstract methods at all. Making it abstract means you cannot instantiate it
    // and have to implement it using another class.
    // Normal method to print inside of abstract class.
    public void inside_abstract() {
        System.out.println("We're inside abstract class");
    }
}
```

### Abstract Inherited Class

The `abstractor_inherit` class inherits the `abstractor` class but does not implement the abstract method, so it is also declared as abstract:
```java
abstract class abstractor_inherit extends abstractor {
    // Normal method to print inside of inherited class
    public void inside_inherited() {
        System.out.println("We're inside inherited class");
    }
}
```

### Concrete Class

The `inherit_all` class inherits both abstract classes and implements the required abstract method:
```java
class inherit_all extends abstractor_inherit {
    // Implementing the abstract method so the class does not need to be an abstract class
    // and we can instantiate it.
    public void show_something() {
        System.out.println("We're inside implementing class");
    }
}
```

### Main Class

The `AbstractKeyword` class contains the `main` method, which is the entry point of the program:
```java
public class AbstractKeyword {
    public static void main(String[] args) {
        // Trying to do the following will throw an error at compile time
        // (Cannot instantiate the type abstract class)
        //abstractor abs = new abstractor();
        // Trying to do the following will throw an error at compile time
        // (Cannot instantiate the type abstract class)
        //abstractor_inherit abs = new abstractor_inherit();
        // We create an object of the implementing class and call all the methods
        inherit_all all = new inherit_all();
        // The method that prints, inside abstract is called
        all.inside_abstract();
        // The method that prints, inside inherited is called
        all.inside_inherited();
        // The implemented method, which prints inside
        // implementing class is called
        all.show_something();
    }
}
```

## Running the Program

To run the `AbstractKeyword` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac AbstractKeyword.java
   ```
3. Run the compiled class:
   ```sh
   java abstractkeyword.AbstractKeyword
   ```

You should see the following output:
```
We're inside abstract class
We're inside inherited class
We're inside implementing class
```

## Conclusion

This program demonstrates the concept of abstract classes and methods in Java. It shows:

1. **Abstract Classes:** Classes that cannot be instantiated and can contain abstract methods.
2. **Abstract Methods:** Methods that have no implementation and must be implemented by subclasses.
3. **Inheritance and Implementation:** How abstract classes and methods are inherited and implemented in concrete classes.

This serves as a foundational reference for understanding how abstraction works in Java and how it can be used to design flexible and reusable code.