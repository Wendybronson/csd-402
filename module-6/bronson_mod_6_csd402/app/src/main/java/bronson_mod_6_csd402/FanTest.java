package bronson_mod_6_csd402;

/*
 * Wendy Bronson
 * September 10, 2026
 * Module 6.2 Programming Assignment
 * Purpose: Test the Fan class using both constructors
 * and demonstrate the Fan class methods.
 */

public class FanTest {

    public static void main(String[] args) {

        // Create first Fan object using the default constructor
        Fan fan1 = new Fan();

        System.out.println("Fan 1 - Default Constructor");
        System.out.println("---------------------------");
        System.out.println(fan1);

        System.out.println();

        // Create second Fan object using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("Fan 2 - Argument Constructor");
        System.out.println("----------------------------");
        System.out.println(fan2);

        System.out.println();

        // Demonstrate setter methods
        System.out.println("Updating Fan 1...");

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println();

        System.out.println("Fan 1 - Updated Values");
        System.out.println("----------------------");
        System.out.println(fan1);

        System.out.println();

        // Demonstrate getter methods
        System.out.println("Fan 2 Values Using Getter Methods");
        System.out.println("---------------------------------");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}