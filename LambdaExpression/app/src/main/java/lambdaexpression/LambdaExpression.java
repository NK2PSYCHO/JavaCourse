package lambdaexpression;

public class LambdaExpression {
    public static void main(String[] args) {
        // Creating an instance of Sayable interface using an inner class
        Sayable sayable = new Sayable() {
            @Override
            public void say() {
                // Printing "Hello World from inner class"
                System.out.println("Hello World from inner class");
            }
        };
        // Calling the say method of Sayable instance
        sayable.say();

        // Creating an instance of Greetable interface using a lambda expression
        Greetable greetable = () -> {
            // Printing "Hello World from lambda expression"
            System.out.println("Hello World from lambda expression");
        };
        // Calling the greet method of Greetable instance
        greetable.greet();

        // Creating an instance of Summable interface using a lambda expression
        Summable summable = (a, b) -> {
            // Returning the sum of two integers
            return a + b;
        };
        // Calling the sum method of Summable instance with arguments 5 and 10
        int result = summable.sum(5, 10);
        // Printing the result of the sum method
        System.out.println("Sum: " + result);
    }
}

// Single Abstract Method (SAM) interface 1
interface Sayable {
    // Abstract method that takes no arguments and returns void
    void say();
}

// Single Abstract Method (SAM) interface 2
interface Greetable {
    // Abstract method that takes no arguments and returns void
    void greet();
}

// Single Abstract Method (SAM) interface 3
interface Summable {
    // Abstract method that takes two integers as arguments and returns their sum
    int sum(int a, int b);
}
