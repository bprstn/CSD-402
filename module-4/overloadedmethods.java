// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Overloaded Methods for Array Average

public class OverloadedMethods {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Short array
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println("Short Array: ");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        // Int array
        int[] intArray = {15, 25, 35, 45};
        System.out.println("\nInt Array: ");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));

        // Long array
        long[] longArray = {100L, 200L, 300L};
        System.out.println("\nLong Array: ");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));

        // Double array
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        System.out.println("\nDouble Array: ");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Generic method to print array elements
    public static void printArray(Object array) {
        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}