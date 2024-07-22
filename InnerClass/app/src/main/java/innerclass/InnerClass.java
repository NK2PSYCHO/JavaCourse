package innerclass;

// There is a concept in Java which allows you to declare member class 
// to a class in object similarly like member varaibles and methods
// known as inner class (class inside class).
// We'll create an outerclass that will contain the inner class.
class OuterClass {
    // This is the InnerClass, a class which is a member of OuterClass, which will
    // only work for
    // the outer class and is completely dependent on it.
    class NormalInnerClass {
        public void showInner() {
            System.out.println("This method belongs to the inner class");
        }
    }

    // It is possible to create a static class with the inner class concept
    // Which is not possible in java for classes as they only support access
    // modifiers or abstract/final keywords.
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

// Another situation we can use inner class is to use it's variant to help implement an
// abstract class in the given scope. So the implementation will only be for the object created and
// limited to the scope of the object.
// This is the abstract which we'll implement using the anonymous inner class
abstract class AbstractClass{
    // This is the abstract method which will be implemented for the anonymous
    // inner class's object.
    public abstract void showAbstract();
}

public class InnerClass {
    public static void main(String[] args) {
        // To create an object of the inner class you need to create an object of the
        // outer class
        OuterClass outer = new OuterClass();
        // To create an object of the inner class we can follow the following syntax
        // Where we access the Inner class as we access any other member of the outer
        // class
        // using the "." operator and use the outer class's object to create a new
        // instance of
        // the inner class.
        OuterClass.NormalInnerClass inner = outer.new NormalInnerClass();
        inner.showInner();
        // Similarly we can create an object for the static inner class but as we know
        // a static member can be accessed directly we don't need to create and use an
        // object for outer class to do so.
        OuterClass.StaticInnerClass innerStatic = new OuterClass.StaticInnerClass();
        innerStatic.showInner();
        // There is also a concept of anonymous inner class where we can create an inner
        // class without using the class keyword or giving it a name for the outerclass
        // We can do so using the following syntax, it can be used change the implementation 
        // of method only for the created object, a way of overriding.
        OuterClass outer1 = new OuterClass(){
            // This member method will behave this way only for the newly created object
            public void showOuter() {
                System.out.println("I caused an error but got overriden");
            }
        };
        // Calling the original implementation of the member method
        outer.showOuter();
        // Calling the overriden implementation of the member method by anonymous inner class
        outer1.showOuter();
        // Here we create a reference varaible of the abstract and using anonymous inner class 
        // implement the abstract method present in the abstract class. You can see creating an
        // object here does not throw an error as the object created is of type anonymous inner class
        // and not the abstract class.
        AbstractClass abs = new AbstractClass() {
            @Override
            public void showAbstract() {
                System.out.println("This is the implementation of abstract method");
            }
        };
        abs.showAbstract();
    }
}
