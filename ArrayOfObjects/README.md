# Array of Objects

This Java program demonstrates the usage of an array of objects (`Student` objects) to store and display information about students.

## Overview

The `ArrayOfObjects` class includes a `main` method that creates an array of `Student` objects and initializes them with static values. Each `Student` object represents a student's information including roll number, first name, last name, and major.

## Code Explanation

### Student Class

The `Student` class defines the structure of a student object with private fields for roll number, first name, last name, and major. It includes constructors to initialize these fields and getters/setters to access and modify them.

```java
class Student {
    private int rollNumber; // Private field for roll number
    private String firstName; // Private field for first name
    private String lastName; // Private field for last name
    private String major; // Private field for major

    // Constructor to initialize Student object
    public Student(int rollNumber, String firstName, String lastName, String major) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    // Getters for accessing private fields
    public int getRollNumber() {
        return rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    // Setters for modifying private fields
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
```

### ArrayOfObjects Class

The `ArrayOfObjects` class contains the `main` method where an array of `Student` objects is created and initialized with sample data. It then iterates through the array to print details of each student using getter methods.

```java
public class ArrayOfObjects {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Initialize Student objects with static values
        students[0] = new Student(1, "John", "Doe", "Computer Science");
        students[1] = new Student(2, "Jane", "Smith", "Mathematics");
        students[2] = new Student(3, "Emily", "Johnson", "Physics");

        // Print the details of each student
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Major: " + student.getMajor());
            System.out.println();
        }
    }
}
```

## Running the Program

To run the `ArrayOfObjects` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac ArrayOfObjects.java
   ```
3. Run the compiled class:
   ```sh
   java ArrayOfObjects
   ```

You should see the following output:

```
Roll Number: 1
First Name: John
Last Name: Doe
Major: Computer Science

Roll Number: 2
First Name: Jane
Last Name: Smith
Major: Mathematics

Roll Number: 3
First Name: Emily
Last Name: Johnson
Major: Physics
```

## Conclusion

This program demonstrates how to use an array of objects (`Student` objects) in Java to store and display information about multiple students. It serves as a foundational example for working with arrays of custom objects in Java.