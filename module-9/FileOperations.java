// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Module 9 - File Handling with Random Numbers

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        String filename = "data.file";
        Random random = new Random();

        try {
            // Check if file exists
            File file = new File(filename);
            boolean fileExists = file.exists();

            // Write or append 10 random numbers
            FileWriter fw = new FileWriter(filename, true); // Append mode
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < 10; i++) {
                pw.print(random.nextInt(100) + " "); // Random number 0-99
            }
            pw.close();
            System.out.println("Random numbers written to file.");

            // Read the file and display the content
            Scanner fileReader = new Scanner(file);
            System.out.println("File contents:");
            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error handling the file.");
        }
    }
}
