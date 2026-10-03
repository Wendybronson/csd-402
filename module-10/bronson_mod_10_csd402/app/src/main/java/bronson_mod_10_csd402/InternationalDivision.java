/*
 * Name: Wendy Bronson
 * Date: October 1, 2026
 * Assignment: Module 10.2 Programming Assignment
 * File: InternationalDivision.java
 * Purpose: Create an international division with
 *          its country and language information.
 */

package bronson_mod_10_csd402;

public class InternationalDivision extends Division {

    private String country;
    private String language;

    // Constructor requires all four values
    public InternationalDivision(String divisionName,
            int accountNumber, String country, String language) {

        super(divisionName, accountNumber);

        this.country = country;
        this.language = language;
    }

    // Implement the abstract display method
    @Override
    public void display() {

        System.out.println("International Division");
        System.out.println("----------------------");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
