/*
 * Wendy Bronson
 * CSD-402
 * Module 3.2 Programming Assignment
 * August 22, 2026
 *
 * Purpose: Use nested for loops to display a seven-row pyramid of
 * powers of two, with an @ symbol at the end of every line.
 */

package Bronson_mod_3_csd402;

public class App {

    public static void main(String[] args) {
        final int NUMBER_OF_ROWS = 7;

        for (int row = 0; row < NUMBER_OF_ROWS; row++) {

            // Print the blank spaces on the left side of the pyramid.
            for (int space = NUMBER_OF_ROWS - 1; space > row; space--) {
                System.out.printf("%4s", "");
            }

            // Print the ascending powers of two.
            for (int exponent = 0; exponent <= row; exponent++) {
                int number = (int) Math.pow(2, exponent);
                System.out.printf("%4d", number);
            }

            // Print the descending powers of two.
            for (int exponent = row - 1; exponent >= 0; exponent--) {
                int number = (int) Math.pow(2, exponent);
                System.out.printf("%4d", number);
            }

            // Print matching spaces so every @ symbol lines up.
            for (int space = NUMBER_OF_ROWS - 1; space > row; space--) {
                System.out.printf("%4s", "");
            }

            System.out.println(" @");
        }
    }
}