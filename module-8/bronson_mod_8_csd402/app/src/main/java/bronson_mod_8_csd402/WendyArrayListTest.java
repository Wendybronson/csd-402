/*
 * Name: Wendy Bronson
 * Date: September 20, 2026
 * Assignment: Module 8.2 Programming Assignment
 * Purpose: Use an ArrayList to store Integer values entered by the user
 *          and determine the largest value in the list.
 */

package bronson_mod_8_csd402;

import java.util.ArrayList;
import java.util.Scanner;

public class WendyArrayListTest {

    /*
     * Method receives an ArrayList and returns the largest Integer.
     * If the ArrayList is empty, the method returns 0.
     */
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (Object value : list) {

            Integer number = (Integer) value;

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int number;

        System.out.println("Enter integers.");
        System.out.println("Enter 0 when you are finished.");

        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            numbers.add(number);

        } while (number != 0);

        Integer largest = max(numbers);

        System.out.println();
        System.out.println("The numbers entered are: " + numbers);
        System.out.println("The largest value is: " + largest);

        // Additional test for an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println();
        System.out.println("Testing an empty ArrayList...");
        System.out.println("Largest value in an empty list: " + max(emptyList));

        input.close();
    }
}