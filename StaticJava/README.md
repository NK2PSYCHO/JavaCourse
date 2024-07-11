# Static Properties and Methods in Java

This Java program demonstrates the usage of static properties and methods in the `Smartphones` class.

## Overview

The `StaticJava` class includes a `main` method that showcases the following features:
- Creation of an array of `Smartphones` objects.
- Initialization of smartphone objects with specific values.
- Utilization of static properties and a static block to initialize a static property.
- Implementation of static and instance methods in the `Smartphones` class.

## Code Explanation

### Smartphones Class

The `Smartphones` class defines properties (`price`, `company`, `name`) for smartphone objects, including a static property `type`. It includes static initialization using a static block and provides methods to get details of each smartphone instance and display the type of all smartphones.

```java
class Smartphones {
    // Properties
    private double price;
    private String company;
    private String name;
    static String type; // Static property

    // Static block to initialize the static property
    static {
        type = "Smartphone";
    }

    // Constructor to initialize the properties
    public Smartphones(double price, String company, String name) {
        this.price = price;
        this.company = company;
        this.name = name;
    }

    // Getter methods
    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    // Static method to display the type of all smartphones
    public static void displayType() {
        System.out.println("All items are of type: " + type);
    }

    // Method to display smartphone details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Company: " + company + ", Price: " + price);
    }
}
```

### StaticJava Class

The `StaticJava` class contains the `main` method where:
- An array of `Smartphones` objects is created and initialized with different smartphone instances.
- The static method `displayType()` is called to display the type of all smartphones.
- The instance method `displayDetails()` is used to print details of each smartphone object in the array.

```java
public class StaticJava {

    public static void main(String[] args) {
        // Create an array of Smartphone objects
        Smartphones[] smartphonesArray = new Smartphones[3];

        // Assign values to the array
        smartphonesArray[0] = new Smartphones(999.99, "Apple", "iPhone 14");
        smartphonesArray[1] = new Smartphones(899.99, "Samsung", "Galaxy S22");
        smartphonesArray[2] = new Smartphones(499.99, "Google", "Pixel 7");

        // Display the type of all smartphones
        Smartphones.displayType();

        // Display the details of each smartphone
        for (Smartphones smartphone : smartphonesArray) {
            smartphone.displayDetails();
        }
    }
}
```

## Running the Program

To run the `StaticJava` program:
1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac StaticJava.java
   ```
3. Run the compiled class:
   ```sh
   java StaticJava
   ```

## Output

You should see the following output:

```
All items are of type: Smartphone
Name: iPhone 14, Company: Apple, Price: 999.99
Name: Galaxy S22, Company: Samsung, Price: 899.99
Name: Pixel 7, Company: Google, Price: 499.99
```

## Conclusion

This program illustrates the use of static properties and methods in Java, emphasizing their role in managing shared data (`type` property) and providing utility functions (`displayType()` method) that apply to all instances of a class (`Smartphones`). It serves as an example of leveraging static members for consistent behavior across multiple objects of the same class.