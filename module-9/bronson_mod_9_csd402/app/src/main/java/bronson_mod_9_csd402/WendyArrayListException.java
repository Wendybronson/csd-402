/*
 * Name: Wendy Bronson
 * Date: September 24, 2026
 * Assignment: Module 9.2 Programming Assignment
 * Purpose: Demonstrate ArrayList exception handling, autoboxing,
 *          auto-unboxing, and file input/output in Java.
 */

package bronson_mod_9_csd402;

import java.util.ArrayList;
import java.util.Scanner;

public class WendyArrayListException {
    
    public static void main(String[] args){
        
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
        
        System.out.println("ArrayList Items:");
        System.out.println("----------------");
        
        for (String item : items){
            System.out.println(item);
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter the index of the item you would like to see again: ");
        String userInput = input.nextLine();
        
        try {        

            Integer index = Integer.valueOf(userInput);
            
            int unboxedIndex = index;
            
            System.out.println("Selected item: " + items.get (unboxedIndex));
            
        }catch (IndexOutOfBoundsException ex){
            
            System.out.println("Exception thrown: Out of Bounds.");
            
        }catch (NumberFormatException ex){
            
            System.out.println("Exception thrown: Please enter a valid interger.");
            
        }
        
        input.close();
      }
    }