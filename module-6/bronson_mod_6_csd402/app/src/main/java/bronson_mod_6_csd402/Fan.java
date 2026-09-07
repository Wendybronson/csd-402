package bronson_mod_6_csd402;
/*
 * Wendy Bronson
 * September 2026
 * Module 6.2 Programming Assignment
 * Purpose: Create a Fan class that demonstrates classes, objects,
 * constructors, constants, private fields, getters, setters,
 * and the toString() method.
 */

public class Fan {

    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on/off status
    public boolean isOn() {
        return on;
    }

    // Setter for on/off status
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Returns a description of the fan's current state
    @Override
    public String toString() {
        return "Fan speed: " + speed +
                "\nFan is on: " + on +
                "\nFan radius: " + radius +
                "\nFan color: " + color;
    }
}