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
