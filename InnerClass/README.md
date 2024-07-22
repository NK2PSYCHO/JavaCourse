# InnerClass Java Project

## Overview

This project demonstrates the usage of inner classes in Java. Inner classes are classes defined within another class. There are several types of inner classes in Java, including member inner classes, static inner classes, and anonymous inner classes. This project includes examples of each type of inner class and how they can be used to encapsulate functionality within an outer class.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `innerclass` package:
```java
package innerclass;
```

### Outer Class

The `OuterClass` contains two inner classes: a normal inner class and a static inner class:
```java
class OuterClass {
    // This is the InnerClass, a class which is a member of OuterClass
    class NormalInnerClass {
        public void showInner() {
            System.out.println("This method belongs to the inner class");
        }
    }

    // This is a static inner class
    static class StaticInnerClass {
        public void showInner() {
            System.out.println("This method belongs to the static inner class");
        }
    }

    // Member method of the outer class
    public void showOuter() {
        System.out.println("I caused an error");
    }
}
```

### Abstract Class

An abstract class is defined to demonstrate the use of anonymous inner classes:
```java
abstract class AbstractClass {
    // This is the abstract method which will be implemented for the anonymous inner class's object.
    public abstract void showAbstract();
}
```

### Main Class

The `InnerClass` class contains the `main` method, which is the entry point of the program:
```java
public class InnerClass {
    public static void main(String[] args) {
        // Creating an object of the outer class
        OuterClass outer = new OuterClass();
        // Creating an object of the normal inner class
        OuterClass.NormalInnerClass inner = outer.new NormalInnerClass();
        inner.showInner();
        // Creating an object of the static inner class
        OuterClass.StaticInnerClass innerStatic = new OuterClass.StaticInnerClass();
        innerStatic.showInner();

        // Using an anonymous inner class to override the method of the outer class for this specific object
        OuterClass outer1 = new OuterClass() {
            // This member method will behave this way only for the newly created object
            public void showOuter() {
                System.out.println("I caused an error but got overridden");
            }
        };
        // Calling the original implementation of the member method
        outer.showOuter();
        // Calling the overridden implementation of the member method by the anonymous inner class
        outer1.showOuter();

        // Using an anonymous inner class to implement the abstract method of the abstract class
        AbstractClass abs = new AbstractClass() {
            @Override
            public void showAbstract() {
                System.out.println("This is the implementation of the abstract method");
            }
        };
        abs.showAbstract();
    }
}
```

## Running the Program

To run the `InnerClass` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac InnerClass.java
   ```
3. Run the compiled class:
   ```sh
   java innerclass.InnerClass
   ```

You should see the following output:
```
This method belongs to the inner class
This method belongs to the static inner class
I caused an error
I caused an error but got overridden
This is the implementation of the abstract method
```

## Conclusion

This program demonstrates the concept of inner classes in Java. It shows:

1. **Member Inner Classes:** Classes that are defined within another class and can access its members.
2. **Static Inner Classes:** Inner classes that are static and can be instantiated without an object of the outer class.
3. **Anonymous Inner Classes:** Inner classes that are defined without a class name and are used to override or implement methods for a specific instance.

This serves as a foundational reference for understanding how inner classes can be used in Java to encapsulate and organize code within a class.