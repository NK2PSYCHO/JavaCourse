package literals;

public class LiteralsConversions {
    public static void main(String[] args) {
        // Binary literal (base 2)
        int binary = 0b1010;
        System.out.println("For base 2, this value is " + binary);

        // Octal literal (base 8)
        int octal = 012;
        System.out.println("For base 8, this value is " + octal);

        // Decimal literal (base 10)
        int decimal = 10;
        System.out.println("For base 10, this value is " + decimal);

        // Hexadecimal literal (base 16)
        int hex = 0xA;
        System.out.println("For base 16, this value is " + hex);

        // Readable number with underscores
        int readableNumber = 1_000_000;
        System.out.println("This value is " + readableNumber);

        // More binary and octal examples
        binary = 0b1010_1010;
        System.out.println("For base 2, this value is " + binary);
        octal = 012_34;
        System.out.println("For base 8, this value is " + octal);

        // Type conversions
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("The integer value casted to double value is " + doubleValue);

        double anotherDoubleValue = 10.5;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("The double value casted to integer value is " + anotherIntValue);

        // Overflow and underflow
        intValue = 130;
        byte byteValue = (byte) intValue;
        System.out.println("The overflow integer value casted to byte value is " + byteValue);

        intValue = -129;
        byteValue = (byte) intValue;
        System.out.println("The underflow integer value casted to byte value is " + byteValue);

        // Type promotion
        byteValue = 10;
        intValue = 20;
        int result = byteValue + intValue;
        System.out.println("The result after type promotion is " + result);

        // Scientific notation
        double smallNumber = 1e-4;
        System.out.println("The number 0.0001 can also be assigned as " + smallNumber);
        double largeNumber = 12e10;
        System.out.println("The number 120,000,000,000 can also be assigned as " + largeNumber);

        // Character arithmetic
        char a = 'A';
        char b = (char) (a + 1);
        System.out.println("A + 1 = " + b);
        char c = (char) (b - 1);
        System.out.println("B - 1 = " + c);
        char d = (char) (a * 1);
        System.out.println("A * 1 = " + d);
        char e = (char) ((d * 2) / 2);
        System.out.println("d / 2 = " + e);
    }
}
