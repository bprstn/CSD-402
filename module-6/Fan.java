// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Fan Class

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
    public int getSpeed() { return speed; }
    public boolean isOn() { return on; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

    // Setters
    public void setSpeed(int speed) { this.speed = speed; }
    public void setOn(boolean on) { this.on = on; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    // toString() method to display fan state
    public String toString() {
        if (on) {
            return "Fan is ON | Speed: " + speed + " | Color: " + color + " | Radius: " + radius;
        } else {
            return "Fan is OFF | Color: " + color + " | Radius: " + radius;
        }
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Creating fan instances
        Fan defaultFan = new Fan();  // Using default constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");  // Using argument constructor

        // Displaying initial fan states
        System.out.println("Default Fan: " + defaultFan);
        System.out.println("Custom Fan: " + customFan);

        // Modifying and testing functionality
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setColor("red");
        defaultFan.setRadius(8.0);

        System.out.println("\nUpdated Default Fan: " + defaultFan);
    }
}

