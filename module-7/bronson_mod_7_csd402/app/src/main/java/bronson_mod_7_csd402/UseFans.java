/*
 * Name: Wendy Bronson
 * Date: September 11, 2026
 * Assignment: Module 7.2 Programming Assignment
 * Purpose: Create a collection of Fan objects and use methods
 *           to display individual Fan objects and the entire
 *           collection without using the toString() method.
 */

package bronson_mod_7_csd402;

import java.util.ArrayList;

public class UseFans {

    // Method that displays one Fan object
    public static void displayFan(Fan fan) {

        System.out.println("Fan Speed: " + fan.getSpeed());
        System.out.println("Fan On: " + fan.isOn());
        System.out.println("Fan Radius: " + fan.getRadius());
        System.out.println("Fan Color: " + fan.getColor());
    }

    // Method that displays a collection of Fan objects
    public static void displayFans(ArrayList<Fan> fans) {

        for (int i = 0; i < fans.size(); ++i) {

            System.out.println("-------------------------");
            System.out.println("Fan " + (i + 1));
            System.out.println("-------------------------");

            displayFan(fans.get(i));

            System.out.println();
        }
    }

    // Main method used to test the Fan objects
    public static void main(String[] args) {

        // Create a collection of Fan objects
        ArrayList<Fan> fans = new ArrayList<>();

        // Add Fan objects to the collection
        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 8.0, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 10.0, "green"));
        fans.add(new Fan(Fan.FAST, true, 12.0, "black"));

        // Display all Fan objects
        System.out.println("Fan Collection");
        System.out.println("==============");

        displayFans(fans);

        // Display one Fan object
        System.out.println("Single Fan Display");
        System.out.println("==================");

        displayFan(fans.get(2));
    }
}