package package2;

public class ClassC {
    // Public method accessible from any class
    public void publicMethod() {
        System.out.println("ClassC: public method");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("ClassC: protected method");
    }

    // Default method (package-private) accessible within the same package
    void defaultMethod() {
        System.out.println("ClassC: default method");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("ClassC: private method");
    }

    // Method to indirectly access private method
    public void callPrivateMethod() {
        privateMethod();
    }
}
