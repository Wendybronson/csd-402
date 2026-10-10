/*
 * Name: Wendy Bronson
 * Date: October 10, 2026
 * Assignment: Module 11.3 Redo of Module 9.2 Programming Assignment
 *
 * Purpose:
 * This program creates an ArrayList containing ten String values,
 * displays each value, and asks the user to enter an index to display
 * one item again. The program demonstrates ArrayList use, autoboxing
 * and unboxing, and exception handling for invalid user input.
 */

package bronson_mod_9_csd402;

import java.util.ArrayList;
import java.util.Scanner;

public class WendyArrayListException {

    public static void main(String[] args) {

        // Create an ArrayList to store ten fruit names.
        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grape");
        items.add("Peach");
        items.add("Strawberry");
        items.add("Blueberry");
        items.add("Watermelon");
        items.add("Pineapple");
        items.add("Mango");

        // Display all values stored in the ArrayList.
        System.out.println("ArrayList Items:");
        System.out.println("----------------");

        for (String item : items) {
            System.out.println(item);
        }

        // Create a Scanner to accept input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print(
            "\nEnter the index of the item you would like to see again: "
        );

        String userInput = input.nextLine();

        try {

            /*
             * Convert the String entered by the user into an Integer.
             * Integer.valueOf() demonstrates the use of the Integer
             * wrapper class.
             */
            Integer index = Integer.valueOf(userInput);

            /*
             * Automatically unbox the Integer object into a primitive int
             * before using the value as the ArrayList index.
             */
            int unboxedIndex = index;

            // Display the ArrayList item at the requested index.
            System.out.println(
                "Selected item: " + items.get(unboxedIndex)
            );

        } catch (IndexOutOfBoundsException ex) {

            /*
             * This exception occurs when the user enters an index
             * that is outside the valid range of the ArrayList.
             */
            System.out.println(
                "Exception thrown: Index is out of bounds."
            );

        } catch (NumberFormatException ex) {

            /*
             * This exception occurs when the user enters something
             * that cannot be converted to an integer.
             */
            System.out.println(
                "Exception thrown: Please enter a valid integer."
            );
        }

        // Close the Scanner when input is no longer needed.
        input.close();
    }
}