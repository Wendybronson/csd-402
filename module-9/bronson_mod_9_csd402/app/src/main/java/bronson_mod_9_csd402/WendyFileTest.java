/*
 * Name: Wendy Bronson
 * Date: September 24, 2026
 * Assignment: Module 9.2 Programming Assignment
 * Purpose: Create or append random integers to a file,
 *          then reopen the file, read the data, and display it.
 */


package bronson_mod_9_csd402;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WendyFileTest {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            // Create the file if it does not already exist
            if (file.createNewFile()) {
                System.out.println("New file created: " + file.getName());
            } else {
                System.out.println("File already exists. New numbers will be appended.");
            }

            // Append data to the file
            FileWriter writer = new FileWriter(file, true);

            System.out.println("\nWriting 10 random numbers to the file...");

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100) + 1;
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Data successfully written.");

            // Reopen and read the file
            Scanner fileReader = new Scanner(file);

            System.out.println("\nContents of data.file:");
            System.out.println("----------------------");

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }

            fileReader.close();

            System.out.println();

        } catch (IOException ex) {

            System.out.println("An error occurred while working with the file.");
            ex.printStackTrace();
        }
    }
}