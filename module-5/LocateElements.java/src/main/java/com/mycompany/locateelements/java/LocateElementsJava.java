// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Locate Largest and Smallest Elements in a 2D Array

public class LocateElements {

    // Method to locate the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int max = Integer.MIN_VALUE;
        int[] location = new int[2]; // Stores row and column index

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        double max = Double.NEGATIVE_INFINITY;
        int[] location = new int[2];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int min = Integer.MAX_VALUE;
        int[] location = new int[2];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        double min = Double.POSITIVE_INFINITY;
        int[] location = new int[2];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        // Test integer array
        int[][] intArray = {
            {3, 8, 2},
            {4, 10, 6},
            {1, 7, 5}
        };

        // Test double array
        double[][] doubleArray = {
            {2.5, 7.8, 1.2},
            {3.6, 9.9, 4.4},
            {8.1, 6.3, 5.5}
        };

        // Display largest element location in int array
        int[] largestInt = locateLargest(intArray);
        System.out.println("Largest integer location: (" + largestInt[0] + ", " + largestInt[1] + ")");

        // Display smallest element location in int array
        int[] smallestInt = locateSmallest(intArray);
        System.out.println("Smallest integer location: (" + smallestInt[0] + ", " + smallestInt[1] + ")");

        // Display largest element location in double array
        int[] largestDouble = locateLargest(doubleArray);
        System.out.println("Largest double location: (" + largestDouble[0] + ", " + largestDouble[1] + ")");

        // Display smallest element location in double array
        int[] smallestDouble = locateSmallest(doubleArray);
        System.out.println("Smallest double location: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}

