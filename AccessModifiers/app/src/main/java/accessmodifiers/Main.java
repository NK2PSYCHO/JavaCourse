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
