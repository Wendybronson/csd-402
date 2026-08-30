/*
 * Wendy Bronson
 * CSD-402
 * Module 4.2 Programming Assignment
 * August 27, 2026
 *
 * Purpose:
 * This program uses overloaded methods to calculate
 * the average of short, int, long, and double arrays.
 * It displays each original array and its average.
 */

package bronson_mod_4_csd402;

public class App {

    public static void main(String[] args) {

        // Create four arrays using different data types and sizes.
        short[] shortArray = {10, 20, 30, 40};
        int[] intArray = {5, 10, 15, 20, 25};
        long[] longArray = {100, 200, 300, 400, 500, 600};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5, 14.5};

        // Display the short array and its average.
        System.out.print("Short Array: ");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Display the int array and its average.
        System.out.print("Int Array: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Display the long array and its average.
        System.out.print("Long Array: ");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Display the double array and its average.
        System.out.print("Double Array: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(doubleArray));
    }

    // Calculate the average of a short array.
    public static short average(short[] array) {
        short sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    // Calculate the average of an int array.
    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Calculate the average of a long array.
    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Calculate the average of a double array.
    public static double average(double[] array) {
        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}