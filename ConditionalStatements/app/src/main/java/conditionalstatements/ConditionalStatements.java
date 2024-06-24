package conditionalstatements;

public class ConditionalStatements {
    public static void main(String[] args) {
        int num = 70, x = 5, y = 7, day = 3;
        boolean flag = false;
        boolean a = true;
        boolean b = false;

        // Check if the number is greater than 60
        if (num > 60)
            System.out.println("The number is greater than 60");

        // Check if the number is less than 100
        if (num < 100) {
            System.out.println("The number is less than 100");
        }
        System.out.println("Message after the if block is executed");

        // Check both conditions: x > 3 and y < 10
        if (x > 3 && y < 10) {
            System.out.println("Both conditions are true");
        }

        // Check at least one condition: y > 10 or x <= 5
        if (y > 10 || x <= 5) {
            System.out.println("At least one condition is true");
        }

        // Check if flag is false
        if (!flag) {
            System.out.println("Flag is false");
        }

        // Check the value of 'a'
        if (a) {
            System.out.println("a is true");
        } else {
            System.out.println("a is false");
        }

        // Check the value of 'b'
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        // Determine the largest number among num, x, and y
        if (num >= x && num >= y) {
            if (num == x && num == y) {
                System.out.println("All numbers are equal.");
            } else if (num == x) {
                System.out.println("num and x are the largest numbers.");
            } else if (num == y) {
                System.out.println("num and y are the largest numbers.");
            } else {
                System.out.println("num is the largest number.");
            }
        } else if (x >= num && x >= y) {
            if (x == y) {
                System.out.println("x and y are the largest numbers.");
            } else {
                System.out.println("x is the largest number.");
            }
        } else {
            System.out.println("y is the largest number.");
        }

        // Ternary operator examples
        int result = (num > x) ? y : x;
        System.out.println("The result is: " + result);

        result = (num > 50) ? (x > y ? x : y) : 0;
        System.out.println("The result is: " + result);

        result = (num > 50) ? x : (num > 30) ? y : 0;
        System.out.println("The result is: " + result);

        // Switch statement for days of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error! Please enter a valid day.");
                break;
        }
    }
}
