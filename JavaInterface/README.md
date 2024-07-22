# JavaInterface Java Project

## Overview

This project demonstrates the usage of interfaces in Java. Interfaces provide a way to define methods and variables that a class must implement. All methods in an interface are implicitly public and abstract, and all variables are implicitly public, static, and final. This project includes examples of single and multiple interface inheritance, as well as using inner classes and anonymous inner classes.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `javainterface` package:
```java
package javainterface;
```

### Interface Definitions

Three interfaces are defined: `FirstInterface`, `SecondInterface`, and `ThirdInterface`.

#### FirstInterface

This interface has a static final member variable and a public abstract method:
```java
interface FirstInterface {
    int memVar = 57;
    void showInterface();
}
```

#### SecondInterface

This interface extends `FirstInterface` and adds another method:
```java
interface SecondInterface extends FirstInterface {
    void showSecondInterface();
}
```

#### ThirdInterface

This interface defines a method and includes a static inner class:
```java
interface ThirdInterface {
    void showInterface();
    static class InsideInterface {
        public void showInnerClass() {
            System.out.println("This is from an inner class which is inside Interface");
        }
    }
}
```

### Abstract Class

An abstract class `ImplementingClass` is defined, which implements both `SecondInterface` and `ThirdInterface` but does not implement their methods:
```java
abstract class ImplementingClass implements SecondInterface, ThirdInterface {
    abstract void showImplementingClass();
}
```

### Concrete Implementing Class

A concrete class `ActualImplementingClass` is defined, which extends `ImplementingClass` and implements all the required methods:
```java
class ActualImplementingClass extends ImplementingClass {
    public void showInterface() {
        System.out.println("This is from the first interface or the third ?");
        System.out.println("Or does this belong to the implementing class ?");
    }

    public void showSecondInterface() {
        System.out.println("This is from second interface");
    }

    void showImplementingClass() {
        System.out.println("This is from the abstract class");
    }
}
```

### Main Class

The `JavaInterface` class contains the `main` method, which is the entry point of the program:
```java
public class JavaInterface {
    public static void main(String[] args) {
        System.out.println("Member variable accessed using reference to FirstInterface " + FirstInterface.memVar);
        System.out.println("Member variable accessed using reference to SecondInterface " + SecondInterface.memVar);

        FirstInterface inter = new ActualImplementingClass();
        inter.showInterface();

        ActualImplementingClass implement = new ActualImplementingClass();
        implement.showInterface();
        implement.showSecondInterface();
        implement.showImplementingClass();

        ThirdInterface.InsideInterface inner = new ThirdInterface.InsideInterface();
        inner.showInnerClass();

        SecondInterface anonymous = new SecondInterface() {
            public void showInterface() {
                System.out.println("We are inside anoonymous inner class implementing FirstInterface method");
            }

            public void showSecondInterface() {
                System.out.println("We are inside anoonymous inner class implementing SecondInterface method");
            }
        };
        anonymous.showInterface();
        anonymous.showSecondInterface();
    }
}
```

## Running the Program

To run the `JavaInterface` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac JavaInterface.java
   ```
3. Run the compiled class:
   ```sh
   java javainterface.JavaInterface
   ```

You should see the following output:
```
Member variable accessed using reference to FirstInterface 57
Member variable accessed using reference to SecondInterface 57
This is from the first interface or the third ?
Or does this belong to the implementing class ?
This is from the first interface or the third ?
Or does this belong to the implementing class ?
This is from second interface
This is from the abstract class
This is from an inner class which is inside Interface
We are inside anoonymous inner class implementing FirstInterface method
We are inside anoonymous inner class implementing SecondInterface method
```

## Conclusion

This program demonstrates the concept of interfaces in Java. It shows:

1. **Interfaces:** How to define interfaces with methods and variables.
2. **Interface Inheritance:** How one interface can inherit another interface.
3. **Multiple Interface Inheritance:** How a class can implement multiple interfaces.
4. **Inner Classes in Interfaces:** How to define and use static inner classes within interfaces.
5. **Anonymous Inner Classes:** How to create anonymous inner classes to implement interfaces on the fly.

This serves as a foundational reference for understanding how interfaces can be used in Java to define and implement design templates.