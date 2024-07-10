package arrays;

class ArraysExample {
    // Initializes a 1D array of doubles with random values between 0 and 1.
    public double[] initializeArray(int size) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.round(Math.random() * 100) / 100.0;
        }
        return arr;
    }

    // Initializes a 2D array of doubles with random values between 0 and 1.
    public double[][] initialize2DArray(int rows, int cols) {
        double[][] arr = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Math.round(Math.random() * 100) / 100.0;
            }
        }
        return arr;
    }

    // Initializes a 3D array of doubles with random values between 0 and 1.
    public double[][][] initialize3DArray(int x, int y, int z) {
        double[][][] arr = new double[x][y][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = Math.round(Math.random() * 100) / 100.0;
                }
            }
        }
        return arr;
    }

    // Initializes a jagged 2D array of doubles with varying row lengths.
    public double[][] initializeJagged2DArray(int[] rowLengths) {
        double[][] arr = new double[rowLengths.length][];
        for (int i = 0; i < rowLengths.length; i++) {
            arr[i] = initializeArray(rowLengths[i]);
        }
        return arr;
    }

    // Initializes a jagged 3D array of doubles with varying slice dimensions.
    public double[][][] initializeJagged3DArray(int[][] sliceDimensions) {
        double[][][] arr = new double[sliceDimensions.length][][];
        for (int i = 0; i < sliceDimensions.length; i++) {
            int rows = sliceDimensions[i][0];
            int cols = sliceDimensions[i][1];
            arr[i] = initialize2DArray(rows, cols);
        }
        return arr;
    }
}

public class Arrays {

    public static void main(String[] args) {
        ArraysExample arr = new ArraysExample();

        // Initialize a 1D array of doubles with random values
        double[] myArray = arr.initializeArray(5);
        System.out.println("Array elements:");
        for (double element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // Initialize a 2D array of doubles with random values
        double[][] my2DArray = arr.initialize2DArray(3, 4);
        System.out.println("2D Array elements:");
        for (double[] row : my2DArray) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Initialize a 3D array of doubles with random values
        double[][][] my3DArray = arr.initialize3DArray(2, 3, 2);
        System.out.println("3D Array elements:");
        for (double[][] slice : my3DArray) {
            for (double[] row : slice) {
                for (double value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        // Initialize a jagged 2D array of doubles with varying row lengths
        int[] rowLengths = { 2, 3, 4 };
        double[][] jagged2DArray = arr.initializeJagged2DArray(rowLengths);
        System.out.println("Jagged 2D array elements:");
        for (double[] row : jagged2DArray) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Initialize a jagged 3D array of doubles with varying slice dimensions
        int[][] sliceDimensions = { { 2, 2 }, { 3, 3 }, { 2, 4 } };
        double[][][] jagged3DArray = arr.initializeJagged3DArray(sliceDimensions);
        System.out.println("Jagged 3D array elements:");
        for (double[][] slice : jagged3DArray) {
            for (double[] row : slice) {
                for (double element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}