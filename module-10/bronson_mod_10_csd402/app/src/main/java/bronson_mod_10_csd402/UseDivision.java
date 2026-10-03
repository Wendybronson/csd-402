/*
 * Name: Wendy Bronson
 * Date: October 1, 2026
 * Assignment: Module 10.2 Programming Assignment
 * File: UseDivision.java
 * Purpose: Create and display two international
 *          divisions and two domestic divisions
 *          using inheritance and abstract methods.
 */

package bronson_mod_10_csd402;

public class UseDivision {

    public static void main(String[] args) {

        // Create two international divisions
        InternationalDivision international1 =
                new InternationalDivision(
                        "European Operations",
                        1001,
                        "Germany",
                        "German");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Canadian Operations",
                        1002,
                        "Canada",
                        "English");

        // Create two domestic divisions
        DomesticDivision domestic1 =
                new DomesticDivision(
                        "Southeast Operations",
                        2001,
                        "North Carolina");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "West Coast Operations",
                        2002,
                        "California");

        // Display all four divisions
        System.out.println("COMPANY DIVISION INFORMATION");
        System.out.println("============================");
        System.out.println();

        international1.display();
        international2.display();

        domestic1.display();
        domestic2.display();
    }
}
