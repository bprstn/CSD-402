// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: UseFans Class For Module 7

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Method to display a single Fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Displaying Fan:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println();
    }

    // Method to display a collection of Fans
    public static void displayFans(List<Fan> fans) {
        System.out.println("Displaying all Fans:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();

        // Add fans to the collection
        fanCollection.add(new Fan());
        fanCollection.add(new Fan(Fan.SLOW, true, 8.0, "red"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 7.5, "green"));
        fanCollection.add(new Fan(Fan.FAST, true, 10.0, "blue"));

        // Display a single fan
        displayFan(fanCollection.get(1));

        // Display all fans
        displayFans(fanCollection);
    }
}
