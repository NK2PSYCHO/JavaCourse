package package1;

public class ClassA {
    // Public method accessible from any class
    public void publicMethod() {
        System.out.println("ClassA: public method");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("ClassA: protected method");
    }

    // Default method (package-private) accessible within the same package
    void defaultMethod() {
        System.out.println("ClassA: default method");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("ClassA: private method");
    }

    // Method to indirectly access private method
    public void callPrivateMethod() {
        privateMethod();
    }
}
