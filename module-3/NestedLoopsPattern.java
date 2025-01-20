// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: M3 - Nested Loops Pattern

public class NestedLoopsPattern {
    public static void main(String[] args) {
        // Loop to generate rows
        for (int i = 1; i <= 7; i++) { // 7 rows
            // Part 1: Increasing sequence
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2; // Double the value
            }

            // Part 2: Decreasing sequence
            value /= 2; // Adjust to prevent doubling the middle value
            for (int j = i - 1; j >= 1; j--) {
                value /= 2; // Halve the value
                System.out.print(value + " ");
            }

            // Add the "@" symbol at the end of each row
            System.out.println("@");
        }
    }
}
