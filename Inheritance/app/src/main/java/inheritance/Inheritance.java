package inheritance;

// Base class
class Fauna {
    String name;

    // Default constructor
    public Fauna() {
        this.name = "Unknown Fauna";
        System.out.println("Fauna default constructor called");
    }

    // Parameterized constructor
    public Fauna(String name) {
        this.name = name;
        System.out.println("Fauna parameterized constructor called");
    }

    // Method to display the name of the fauna
    public void display() {
        System.out.println("Fauna name: " + name);
    }
}

// Single-level inheritance: Mammal inherits from Fauna
class Mammal extends Fauna {
    String type;

    // Default constructor
    public Mammal() {
        super(); // Call the parent class (Fauna) default constructor
        this.type = "Unknown Mammal";
        System.out.println("Mammal default constructor called");
    }

    // Parameterized constructor
    public Mammal(String name, String type) {
        super(name); // Call the parent class (Fauna) parameterized constructor
        this.type = type;
        System.out.println("Mammal parameterized constructor called");
    }

    // Method to display the name and type of the mammal
    public void display() {
        super.display(); // Call the parent class (Fauna) display method
        System.out.println("Mammal type: " + type);
    }
}

// Multi-level inheritance: Dog inherits from Mammal, which inherits from Fauna
class Dog extends Mammal {
    String breed;

    // Default constructor
    public Dog() {
        super(); // Call the parent class (Mammal) default constructor
        this.breed = "Unknown Breed";
        System.out.println("Dog default constructor called");
    }

    // Parameterized constructor
    public Dog(String name, String type, String breed) {
        super(name, type); // Call the parent class (Mammal) parameterized constructor
        this.breed = breed;
        System.out.println("Dog parameterized constructor called");
    }

    // Method to display the name, type, and breed of the dog
    public void display() {
        super.display(); // Call the parent class (Mammal) display method
        System.out.println("Dog breed: " + breed);
    }
}

// Hierarchical inheritance: Bird inherits from Fauna
class Bird extends Fauna {
    String species;

    // Default constructor
    public Bird() {
        super(); // Call the parent class (Fauna) default constructor
        this.species = "Unknown Species";
        System.out.println("Bird default constructor called");
    }

    // Parameterized constructor
    public Bird(String name, String species) {
        super(name); // Call the parent class (Fauna) parameterized constructor
        this.species = species;
        System.out.println("Bird parameterized constructor called");
    }

    // Method to display the name and species of the bird
    public void display() {
        super.display(); // Call the parent class (Fauna) display method
        System.out.println("Bird species: " + species);
    }
}

// Hybrid inheritance: Bat inherits from Mammal, which inherits from Fauna
class Bat extends Mammal {
    String capability;

    // Default constructor
    public Bat() {
        super(); // Call the parent class (Mammal) default constructor
        this.capability = "Unknown Capability";
        System.out.println("Bat default constructor called");
    }

    // Parameterized constructor
    public Bat(String name, String type, String capability) {
        super(name, type); // Call the parent class (Mammal) parameterized constructor
        this.capability = capability;
        System.out.println("Bat parameterized constructor called");
    }

    // Method to display the name, type, and capability of the bat
    public void display() {
        super.display(); // Call the parent class (Mammal) display method
        System.out.println("Bat capability: " + capability);
    }
}

// Main class to demonstrate the different types of inheritance
public class Inheritance {

    public static void main(String[] args) {
        // Demonstrating Single-level Inheritance
        System.out.println("Single-level Inheritance:");
        Mammal mammal = new Mammal("Lion", "Carnivorous");
        mammal.display();

        // Demonstrating Multi-level Inheritance
        System.out.println("\nMulti-level Inheritance:");
        Dog dog = new Dog("Dog", "Domestic", "Labrador");
        dog.display();

        // Demonstrating Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Bird bird = new Bird("Parrot", "Psittacine");
        bird.display();

        // Demonstrating Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        Bat bat = new Bat("Bat", "Mammal", "Flying");
        bat.display();
    }
}
