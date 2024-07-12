package package2;

public class ClassD {
    // Public method accessible from any class
    public void publicMethod() {
        System.out.println("ClassD: public method");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("ClassD: protected method");
    }

    // Default method (package-private) accessible within the same package
    void defaultMethod() {
        System.out.println("ClassD: default method");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("ClassD: private method");
    }

    // Method to indirectly access private method
    public void callPrivateMethod() {
        privateMethod();
    }
}
