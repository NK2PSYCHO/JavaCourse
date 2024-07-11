package arrayofobjects;

// Define a Student class
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
