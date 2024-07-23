# Enumeration Java Project

## Overview

This project demonstrates the usage of enums in Java. Enums (short for enumerations) provide a way to define a set of named constants. Enums can have fields, methods, and constructors, making them more powerful than simple constants. This project includes an example of an enum that represents the days of the week, each with an associated temperature. It also shows how to use enums in a switch statement.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `enumeration` package:
```java
package enumeration;
```

### Enum Definition

The `Weekdays` enum is defined inside the `Enumeration` class. Each enum constant represents a day of the week and can have an associated temperature:
```java
public class Enumeration {

    public enum Weekdays {
        MONDAY(30),
        TUESDAY(31),
        WEDNESDAY(),
        THURSDAY(33),
        FRIDAY(35),
        SATURDAY(),
        SUNDAY();
        
        private int temperature;
        
        Weekdays() {
            this.temperature = 25;
        }
        
        Weekdays(int temperature) {
            this.temperature = temperature;
        }
        
        public int getTemperature() {
            return temperature;
        }
        
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
    }
}
```

### Main Method

The `main` method demonstrates how to use the `Weekdays` enum. It assigns temperatures to days that use the default constructor, sets a variable to a specific day, and uses a switch statement to print the day's name and temperature:
```java
public class Enumeration {

    public static void main(String[] args) {
        Weekdays.WEDNESDAY.setTemperature(28);
        Weekdays.SATURDAY.setTemperature(27);
        Weekdays.SUNDAY.setTemperature(26);
        
        Weekdays today = Weekdays.FRIDAY;
        
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday with temperature: " + today.getTemperature());
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday with temperature: " + today.getTemperature());
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday with temperature: " + today.getTemperature());
                break;
            case THURSDAY:
                System.out.println("Today is Thursday with temperature: " + today.getTemperature());
                break;
            case FRIDAY:
                System.out.println("Today is Friday with temperature: " + today.getTemperature());
                break;
            case SATURDAY:
                System.out.println("Today is Saturday with temperature: " + today.getTemperature());
                break;
            case SUNDAY:
                System.out.println("Today is Sunday with temperature: " + today.getTemperature());
                break;
        }
    }
}
```

## Running the Program

To run the `Enumeration` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac Enumeration.java
   ```
3. Run the compiled class:
   ```sh
   java enumeration.Enumeration
   ```

You should see the following output:
```
Today is Friday with temperature: 35
```

## Conclusion

This program demonstrates the concept of enums in Java. It shows:

1. **Enums with Fields and Constructors:** How to define enums with fields and constructors to store additional information.
2. **Default and Parameterized Constructors:** How to use both default and parameterized constructors in enums.
3. **Getter and Setter Methods:** How to add methods to enums to get and set the values of fields.
4. **Using Enums in Switch Statements:** How to use enums in switch statements to perform actions based on the value of an enum constant.

This serves as a foundational reference for understanding how to use enums in Java to define a set of related constants with additional functionality.