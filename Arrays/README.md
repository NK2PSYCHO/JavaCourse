# Arrays

This folder contains a Java program that demonstrates the initialization and usage of various types of arrays, including 1D, 2D, 3D, jagged 2D, and jagged 3D arrays. The program initializes these arrays with random values and prints their elements to the console.

## Overview

The `Arrays` class includes a `main` method that creates an instance of the `ArraysExample` class and uses its methods to initialize and display different types of arrays. The `ArraysExample` class contains methods for initializing 1D, 2D, 3D, jagged 2D, and jagged 3D arrays.

## Code Explanation

### Package Declaration

The code begins with a package declaration, indicating that it belongs to the `arrays` package:
```java
package arrays;
```

### ArraysExample Class

The `ArraysExample` class contains methods to initialize different types of arrays with random values between 0 and 1:

1. **Initialize a 1D array:**
   ```java
   public double[] initializeArray(int size) {
       double[] arr = new double[size];
       for (int i = 0; i < size; i++) {
           arr[i] = Math.round(Math.random() * 100) / 100.0;
       }
       return arr;
   }
   ```

2. **Initialize a 2D array:**
   ```java
   public double[][] initialize2DArray(int rows, int cols) {
       double[][] arr = new double[rows][cols];
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               arr[i][j] = Math.round(Math.random() * 100) / 100.0;
           }
       }
       return arr;
   }
   ```

3. **Initialize a 3D array:**
   ```java
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
   ```

4. **Initialize a jagged 2D array:**
   ```java
   public double[][] initializeJagged2DArray(int[] rowLengths) {
       double[][] arr = new double[rowLengths.length][];
       for (int i = 0; i < rowLengths.length; i++) {
           arr[i] = initializeArray(rowLengths[i]);
       }
       return arr;
   }
   ```

5. **Initialize a jagged 3D array:**
   ```java
   public double[][][] initializeJagged3DArray(int[][] sliceDimensions) {
       double[][][] arr = new double[sliceDimensions.length][][];
       for (int i = 0; i < sliceDimensions.length; i++) {
           int rows = sliceDimensions[i][0];
           int cols = sliceDimensions[i][1];
           arr[i] = initialize2DArray(rows, cols);
       }
       return arr;
   }
   ```

### Arrays Class

The `Arrays` class contains the `main` method, which is the entry point of the program:
```java
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
```

## Running the Program

To run the `Arrays` program:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/your-username/Arrays.git
   ```
3. Navigate to the project directory:
   ```sh
   cd Arrays
   ```
4. Compile the Java file:
   ```sh
   javac arrays/Arrays.java
   ```
5. Run the compiled class:
   ```sh
   java arrays.Arrays
   ```

You should see the following output:
```
Array elements:
0.39 0.7 0.55 0.68 0.48 

2D Array elements:
0.13 0.68 0.88 0.15 
0.92 0.11 0.38 0.56 
0.22 0.36 0.1 0.33 

3D Array elements:
0.41 0.58 
0.9 0.67 
0.34 0.19 

0.76 0.6 
0.64 0.44 
0.39 0.26 


Jagged 2D array elements:
0.73 0.28 
0.56 0.79 0.47 
0.92 0.34 0.64 0.11 

Jagged 3D array elements:
0.85 0.33 
0.49 0.62 

0.58 0.37 0.95 
0.29 0.44 0.6 
0.19 0.78 0.71 

0.54 0.93 0.18 0.36 
0.57 0.8 0.5 0.1 
```

## Conclusion

This program provides a comprehensive overview of array initialization and manipulation in Java. It demonstrates how to initialize 1D, 2D, 3D, jagged 2D, and jagged 3D arrays with random values and how to print their elements. This serves as a foundational reference for working with arrays in Java.