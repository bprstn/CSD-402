// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Module 9 - String ArrayList & Exception Handling

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList with at least 10 Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Dog");
        words.add("Elephant");
        words.add("Fish");
        words.add("Cat");
        words.add("Horse");
        words.add("Ice");
        words.add("Snow");

        // Print each element using a for-each loop
        System.out.println("ArrayList Elements:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user for an index
        System.out.print("\nEnter an index (0-9) to see the element: ");
        try {
            int index = scanner.nextInt(); // Auto-boxing from int to Integer
            System.out.println("You selected: " + words.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
