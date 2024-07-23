package enumeration;

// Enum Weekdays with days of the week
public class Enumeration {

    // Creating an enum called Weekdays
    public enum Weekdays {
        // Days with parameterized constructors
        MONDAY(30),       // Assigning temperature 30
        TUESDAY(31),      // Assigning temperature 31
        WEDNESDAY(),      // Uses default constructor, temperature to be set later
        THURSDAY(33),     // Assigning temperature 33
        FRIDAY(35),       // Assigning temperature 35
        SATURDAY(),       // Uses default constructor, temperature to be set later
        SUNDAY();         // Uses default constructor, temperature to be set later
        
        // Variable to store the temperature for each day
        private int temperature;
        
        // Default constructor
        Weekdays() {
            // Assign a default temperature of 25
            this.temperature = 25;
        }
        
        // Parameterized constructor
        Weekdays(int temperature) {
            // Assign the given temperature
            this.temperature = temperature;
        }
        
        // Getter for temperature
        public int getTemperature() {
            return temperature;
        }
        
        // Setter for temperature
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
    }
    
    public static void main(String[] args) {
        // Assign temperatures to days that use the default constructor
        Weekdays.WEDNESDAY.setTemperature(28); // Setting temperature for Wednesday
        Weekdays.SATURDAY.setTemperature(27);  // Setting temperature for Saturday
        Weekdays.SUNDAY.setTemperature(26);    // Setting temperature for Sunday
        
        // Create a variable of the enum and assign it a day
        Weekdays today = Weekdays.FRIDAY;
        
        // Use switch case to check the day and print the day with its temperature
        switch (today) {
            case MONDAY:
                // Printing the day and its temperature
                System.out.println("Today is Monday with temperature: " + today.getTemperature());
                break;
            case TUESDAY:
                // Printing the day and its temperature
                System.out.println("Today is Tuesday with temperature: " + today.getTemperature());
                break;
            case WEDNESDAY:
                // Printing the day and its temperature
                System.out.println("Today is Wednesday with temperature: " + today.getTemperature());
                break;
            case THURSDAY:
                // Printing the day and its temperature
                System.out.println("Today is Thursday with temperature: " + today.getTemperature());
                break;
            case FRIDAY:
                // Printing the day and its temperature
                System.out.println("Today is Friday with temperature: " + today.getTemperature());
                break;
            case SATURDAY:
                // Printing the day and its temperature
                System.out.println("Today is Saturday with temperature: " + today.getTemperature());
                break;
            case SUNDAY:
                // Printing the day and its temperature
                System.out.println("Today is Sunday with temperature: " + today.getTemperature());
                break;
        }
    }
}
