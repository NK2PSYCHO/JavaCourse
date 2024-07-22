package javainterface;

// We know what is abstract keyword and how to use it, what is abstract method and abstract class.
// Abstract class is something which can have defintions of methods (abstract) and normal methods with normal variables.
// When you know all the methods of your design template will be public and abstract and the variables will be 
// final and static you can use an Interface.
// Interface is a design template concept where are methods are by default public and abstract and all the
// varibales are by default final and static.
// We'll use the following interface for example
interface FirstInterface {
    // You cannot create object of an Interface and it does not have allocated
    // memory in the heap
    // so all the member variables it has needs to be final and static (they are
    // implicitly both)
    int memVar = 57;

    // Implicitly the methods defined inside of an interface are public and
    // abstract.
    void showInterface();
}

// Just like classes Intefaces can inherit other Interfaces to get their member
// variables and their
// Member methods. As the variables are final and static we can use this
// interface to access the ones
// belonging to parent interface.
interface SecondInterface extends FirstInterface {
    // We create another method definition here
    void showSecondInterface();
}

// We've created this interface to show that a class can implement multiple
// Interfaces at once.
interface ThirdInterface {
    // As these are only method definitions and not implementations you can
    // implement a variant of multiple inheritance using the interfaces.
    void showInterface();

    // Similar to classes interface can have inner class only
    // catch is same as member varaibales they should be static
    static class InsideInterface {
        public void showInnerClass() {
            System.out.println("This is from an inner class which is inside Interface");
        }
    }
}

// We're creating a implementing class which will not implement the method
// definitions
// from the interfaces and will throw the error that it should implement them.
// To avoid this
// we make this class an abstract class, so it has to be implemented by other
// class. This demonstrates that to tell the java that a class or that
// a class inheriting from the abstract class will implement the interface
// we use the implements keyword.
abstract class ImplementingClass implements SecondInterface, ThirdInterface {
    abstract void showImplementingClass();
}

// This class will actually implement the abstract method and all the methods
// from the interfaces.
class ActualImplementingClass extends ImplementingClass {
    // As the first and third interface have methods with same name but they're only
    // definitions
    // and as interfaces don't have their own memory in the heap the implementation
    // belongs to the class and will be implemented once.
    public void showInterface() {
        System.out.println("This is from the first interface or the third ?");
        System.out.println("Or does this belong to the implementing class ?");
    }

    // Implementing method from second interface.
    public void showSecondInterface() {
        System.out.println("This is from second interface");
    }

    // Implementing method from abstract class
    void showImplementingClass() {
        System.out.println("This is from the abstract class");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        // You can directly access the variable from FirstInterface as it is static
        // using the reference of both FirstInterface and SecondInterface which inherits
        // FirstInterface
        System.out.println("Member variable accessed using reference to FirstInterface " + FirstInterface.memVar);
        System.out.println("Member variable accessed using reference to SecondInterface " + SecondInterface.memVar);

        // Similar to abstract class we can create reference variable of interface and
        // object of implementing class
        // and it will only be able to access it's own member methods.
        FirstInterface inter = new ActualImplementingClass();
        // While the following will work
        inter.showInterface();
        // This will not work as FirstInterface does not know that this exists
        // showSecondInterface will be undefined for the type FirstInterface
        // inter.showSecondInterface();
        // What you can do is create reference variable of the inheriting interface
        // so you can access the member methods of both interfaces or create
        // reference varaibale of the implementing class itself so you
        // can access all the implemented methods and logic
        ActualImplementingClass implement = new ActualImplementingClass();
        implement.showInterface();
        implement.showSecondInterface();
        implement.showImplementingClass();
        // We can use the following syntax to create an object of the inner class
        // and call it's method
        ThirdInterface.InsideInterface inner = new ThirdInterface.InsideInterface();
        inner.showInnerClass();
        // Similar to abstract class we can implement Interfaces using anonymous
        // inner class for a given object insisde a given scope
        SecondInterface anonymous = new SecondInterface() {
            // We need to implement all the methods as SecondInterface is inheriting
            // Firstinterface
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
