package datatypes;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // byte data type
        byte byteVarMin = Byte.MIN_VALUE;
        byte byteVarMax = Byte.MAX_VALUE;
        System.out.println("For the datatype byte, size is " + Byte.SIZE + " bits, minimum value is "
                + byteVarMin + ", and maximum value is " + byteVarMax);

        // short data type
        short shortVarMin = Short.MIN_VALUE;
        short shortVarMax = Short.MAX_VALUE;
        System.out.println("For the datatype short, size is " + Short.SIZE + " bits, minimum value is "
                + shortVarMin + ", and maximum value is " + shortVarMax);

        // int data type
        int intVarMin = Integer.MIN_VALUE;
        int intVarMax = Integer.MAX_VALUE;
        System.out.println("For the datatype int, size is " + Integer.SIZE + " bits, minimum value is "
                + intVarMin + ", and maximum value is " + intVarMax);

        // long data type
        long longVarMin = Long.MIN_VALUE;
        long longVarMax = Long.MAX_VALUE;
        System.out.println("For the datatype long, size is " + Long.SIZE + " bits, minimum value is "
                + longVarMin + ", and maximum value is " + longVarMax);

        // float data type
        float floatVarMin = Float.MIN_VALUE;
        float floatVarMax = Float.MAX_VALUE;
        System.out.println("For the datatype float, size is " + Float.SIZE + " bits, minimum value is "
                + floatVarMin + ", and maximum value is " + floatVarMax);

        // double data type
        double doubleVarMin = Double.MIN_VALUE;
        double doubleVarMax = Double.MAX_VALUE;
        System.out.println("For the datatype double, size is " + Double.SIZE + " bits, minimum value is "
                + doubleVarMin + ", and maximum value is " + doubleVarMax);

        // char data type
        char charVarMin = Character.MIN_VALUE;
        char charVarMax = Character.MAX_VALUE;
        System.out.println("For the datatype char, size is " + Character.SIZE + " bits, minimum value is "
                + (int) charVarMin + ", and maximum value is " + (int) charVarMax);

        // boolean data type
        boolean booleanVarFalse = false;
        boolean booleanVarTrue = true;
        System.out.println("For the datatype boolean, it has two possible values: " + booleanVarFalse
                + " and " + booleanVarTrue);
    }
}
