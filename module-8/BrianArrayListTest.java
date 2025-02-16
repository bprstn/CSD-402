// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Module 8 - ArrayList Test

import java.util.ArrayList;
import java.util.Scanner;

public class BrianArrayListTest {

    // My Method to find the maximum value in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Return 0 if the list is empty
        }

        int maxValue = list.get(0); // Assume the first element is the max
        for (int num : list) {
            if (num > maxValue) {
                maxValue = num; // Update max value if a larger number is found
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int input = scanner.nextInt();
            numbers.add(input); // Add input to ArrayList

            if (input == 0) {
                break; // Stop taking input when user enters 0
            }
        }

        scanner.close(); // Close scanner

        // Find and display the largest number
        int largest = max(numbers);
        System.out.println("The largest number in the list is: " + largest);
    }
}
