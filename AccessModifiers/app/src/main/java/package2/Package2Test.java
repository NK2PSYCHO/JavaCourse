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
