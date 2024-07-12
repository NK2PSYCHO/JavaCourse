# Inheritance Types in Java

This Java program demonstrates various types of inheritance: single-level, multi-level, hierarchical, and hybrid. Each type showcases how classes inherit attributes and behaviors from their parent classes.

## Overview

The program defines several classes representing different types of fauna, each inheriting from a parent class to demonstrate specific inheritance types:

1. **Single-level Inheritance**: `Mammal` inherits from `Fauna`.
2. **Multi-level Inheritance**: `Dog` inherits from `Mammal`, which inherits from `Fauna`.
3. **Hierarchical Inheritance**: `Bird` inherits directly from `Fauna`.
4. **Hybrid Inheritance**: `Bat` inherits from `Mammal`, which inherits from `Fauna`.

Each class has default and parameterized constructors, methods to display information, and utilizes the `super` keyword to invoke parent class constructors and methods.

## Code Explanation

### Class Structure

- **Fauna Class**: Represents a generic fauna with a `name` attribute and methods to initialize and display the name.

- **Mammal Class**: Inherits from `Fauna` and adds a `type` attribute specific to mammals. Overrides the `display` method to include mammal type.

- **Dog Class**: Inherits from `Mammal` and introduces a `breed` attribute specific to dogs. Overrides the `display` method to include dog breed.

- **Bird Class**: Inherits directly from `Fauna` and includes a `species` attribute specific to birds. Overrides the `display` method to include bird species.

- **Bat Class**: Inherits from `Mammal` and includes a `capability` attribute specific to bats. Overrides the `display` method to include bat capabilities.

### Main Method

The `Inheritance` class contains the `main` method to demonstrate each type of inheritance:

- **Single-level Inheritance**: Creates an instance of `Mammal` (e.g., Lion).

- **Multi-level Inheritance**: Creates an instance of `Dog` (e.g., Labrador).

- **Hierarchical Inheritance**: Creates an instance of `Bird` (e.g., Parrot).

- **Hybrid Inheritance**: Creates an instance of `Bat` (e.g., Flying Bat).

Each instance is initialized with specific attributes and displays information using overridden `display` methods.

## Running the Program

To run the `Inheritance` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac Inheritance.java
   ```
3. Run the compiled class:
   ```sh
   java inheritance.Inheritance
   ```

## Example Output

Upon running the program, you should see output similar to:

```
Single-level Inheritance:
Fauna default constructor called
Mammal default constructor called
Fauna name: Lion
Mammal type: Carnivorous

Multi-level Inheritance:
Fauna default constructor called
Mammal default constructor called
Dog default constructor called
Fauna name: Dog
Mammal type: Domestic
Dog breed: Labrador

Hierarchical Inheritance:
Fauna default constructor called
Bird default constructor called
Fauna name: Parrot
Bird species: Psittacine

Hybrid Inheritance:
Fauna default constructor called
Mammal default constructor called
Bat default constructor called
Fauna name: Bat
Mammal type: Mammal
Bat capability: Flying
```

## Conclusion

This program provides a practical demonstration of different inheritance types in Java, illustrating how classes can inherit attributes and behaviors from parent classes to model real-world relationships between different types of fauna.