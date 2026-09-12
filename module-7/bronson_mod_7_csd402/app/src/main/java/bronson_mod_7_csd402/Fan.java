/*
 * Name: Wendy Bronson
 * Date: September 11, 2026
 * Assignment: Module 7.2 Programming Assignment
 * Purpose: Define the Fan class and use the this reference
 *          throughout the class where allowed.
 */

package bronson_mod_7_csd402;

public class Fan {

    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return this.speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on
    public boolean isOn() {
        return this.on;
    }

    // Setter for on
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Returns the current state of the fan
    @Override
    public String toString() {
        
        if (this.on){
            return "Fan Speed: " + this.speed
                    + "\nFan color: "+ this.color
                    + "\nFan radius: " + this.radius
                    + "\nFan is on.";
           
        }else {
            return "Fan color: " + this.color
                    + "\nFan radius: " + this.radius
                    + "\nFan is off.";
        }       
    }
}
