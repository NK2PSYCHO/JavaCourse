package staticjava;

// Define the Smartphones class
class Smartphones {
    // Instance properties
    private double price;     // Price of the smartphone
    private String company;   // Company that manufactures the smartphone
    private String name;      // Name of the smartphone

    // Static property
    static String type;       // Type of the device, common to all instances

    // Static block to initialize the static property
    static {
        type = "Smartphone"; // All instances of Smartphones will have type "Smartphone"
    }

    // Constructor to initialize the instance properties
    public Smartphones(double price, String company, String name) {
        this.price = price;     // Initialize the price
        this.company = company; // Initialize the company
        this.name = name;       // Initialize the name
    }

    // Getter methods to access private properties
    public double getPrice() {
        return price;           // Return the price of the smartphone
    }

    public String getCompany() {
        return company;         // Return the company of the smartphone
    }

    public String getName() {
        return name;            // Return the name of the smartphone
    }

    // Static method to display the type of all smartphones
    public static void displayType() {
        System.out.println("All items are of type: " + type); // Print the type
    }

    // Instance method to display the details of the smartphone
    public void displayDetails() {
        System.out.println("Name: " + name + ", Company: " + company + ", Price: " + price); // Print the details
    }
}

// Main class
public class StaticJava {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create an array of Smartphones objects
        Smartphones[] smartphonesArray = new Smartphones[3]; // Array to hold 3 Smartphone objects

        // Assign values to the array elements
        smartphonesArray[0] = new Smartphones(999.99, "Apple", "iPhone 14");     // First smartphone details
        smartphonesArray[1] = new Smartphones(899.99, "Samsung", "Galaxy S22");  // Second smartphone details
        smartphonesArray[2] = new Smartphones(499.99, "Google", "Pixel 7");      // Third smartphone details

        // Display the type of all smartphones using the static method
        Smartphones.displayType(); // Call the static method to display the type

        // Display the details of each smartphone using a loop
        for (Smartphones smartphone : smartphonesArray) {
            smartphone.displayDetails(); // Call the instance method to display details
        }
    }
}
