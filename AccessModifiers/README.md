# Java Class Access Levels

This Java program demonstrates the use of different access levels (`public`, `protected`, default (package-private), and `private`) within classes across different packages. The program illustrates how these access levels affect the visibility and accessibility of class methods.

## Overview

The program consists of several classes organized into two packages: `package1` and `package2`. Each class defines methods with different access levels to demonstrate how they can be accessed from within the same package and from other packages.

### Packages and Classes

- **package1**
  - `ClassA`
  - `ClassB`
  - `Package1Test`

- **package2**
  - `ClassC`
  - `ClassD`
  - `Package2Test`

- **packaging**
  - `Main`

### ClassA and ClassB (package1)

- **Public Method**: Accessible from any class.
- **Protected Method**: Accessible within the same package and by subclasses.
- **Default Method**: Accessible within the same package.
- **Private Method**: Accessible only within the class itself.
- **Indirect Access to Private Method**: A public method to call the private method.

### ClassC and ClassD (package2)

- **Public Method**: Accessible from any class.
- **Protected Method**: Accessible within the same package and by subclasses.
- **Default Method**: Accessible within the same package.
- **Private Method**: Accessible only within the class itself.
- **Indirect Access to Private Method**: A public method to call the private method.

### Main Class (packaging)

The `Main` class demonstrates how to create instances of classes from different packages and access their methods based on their access levels.

## Code Explanation

### Main Class

The `Main` class in the `packaging` package creates instances of `ClassA`, `ClassB`, `ClassC`, and `ClassD` and attempts to access their methods.

```java
package accessmodifiers;

import package1.ClassA;
import package1.ClassB;
import package2.ClassC;
import package2.ClassD;

public class Main {
    public static void main(String[] args) {
        // Create instances of classes from different packages
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();

        // Accessing public methods
        classA.publicMethod();
        classB.publicMethod();
        classC.publicMethod();
        classD.publicMethod();

        // Accessing protected methods (not allowed from Main since it's not in the same package or subclass)
        // classA.protectedMethod();
        // classB.protectedMethod();
        // classC.protectedMethod();
        // classD.protectedMethod();

        // Accessing default methods (not allowed from Main since it's not in the same package)
        // classA.defaultMethod();
        // classB.defaultMethod();
        // classC.defaultMethod();
        // classD.defaultMethod();

        // Accessing private methods (not allowed from Main since they are private to their own classes)
        // classA.privateMethod();
        // classB.privateMethod();
        // classC.privateMethod();
        // classD.privateMethod();
    }
}
```

### Package1Test and Package2Test

These classes demonstrate accessing methods within the same package.

```java
package package1;

public class Package1Test {
    public static void main(String[] args) {
        // Create instances of classes within the same package
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        // Accessing public methods
        classA.publicMethod();
        classB.publicMethod();

        // Accessing protected methods
        classA.protectedMethod();
        classB.protectedMethod();

        // Accessing default methods (package-private)
        classA.defaultMethod();
        classB.defaultMethod();

        // Accessing private methods (not allowed outside their respective classes)
        // classA.privateMethod();
        // classB.privateMethod();

        // Access private methods indirectly
        classA.callPrivateMethod();
        classB.callPrivateMethod();
    }
}

package package2;

public class Package2Test {
    public static void main(String[] args) {
        // Create instances of classes within the same package
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();

        // Accessing public methods
        classC.publicMethod();
        classD.publicMethod();

        // Accessing protected methods
        classC.protectedMethod();
        classD.protectedMethod();

        // Accessing default methods (package-private)
        classC.defaultMethod();
        classD.defaultMethod();

        // Accessing private methods (not allowed outside their respective classes)
        // classC.privateMethod();
        // classD.privateMethod();

        // Access private methods indirectly
        classC.callPrivateMethod();
        classD.callPrivateMethod();
    }
}
```

## Running the Program

To run the program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java files:
   ```sh
   javac packaging/Main.java package1/*.java package2/*.java
   ```
3. Run the compiled `Main` class:
   ```sh
   java packaging.Main
   ```

## Example Output

Upon running the `Main` class, you should see the following output:

```
ClassA: public method
ClassB: public method
ClassC: public method
ClassD: public method
```

## Conclusion

This program provides a practical demonstration of different access levels in Java. It shows how access modifiers (`public`, `protected`, default (package-private), and `private`) control the visibility of methods across different packages and classes. It also highlights the importance of understanding these access levels when designing and interacting with classes in Java.
