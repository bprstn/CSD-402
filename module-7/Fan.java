// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Fan Class (I Updated this for this: Module 7)

import java.util.ArrayList;
import java.util.List;

public class Fan {

    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() { return this.speed; }
    public boolean isOn() { return this.on; }
    public double getRadius() { return this.radius; }
    public String getColor() { return this.color; }

    // Setters
    public void setSpeed(int speed) { this.speed = speed; }
    public void setOn(boolean on) { this.on = on; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    // Method to display fan details without using toString()
    public void displayFanDetails() {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + this.speed);
        System.out.println("Status: " + (this.on ? "ON" : "OFF"));
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius);
        System.out.println();
    }

    // Main method for quick testing
    public static void main(String[] args) {
        Fan defaultFan = new Fan();  // Default fan
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue"); // Custom fan

        // Display fans using the new display method
        defaultFan.displayFanDetails();
        customFan.displayFanDetails();
    }
}
