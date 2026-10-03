/*
 * Name: Wendy Bronson
 * Date: October 1, 2026
 * Assignment: Module 10.2 Programming Assignment
 * File: DomesticDivision.java
 * Purpose: Create a domestic division with
 *          its state information.
 */

package bronson_mod_10_csd402;

public class DomesticDivision extends Division {

    private String state;

    // Constructor requires all three values
    public DomesticDivision(String divisionName,
            int accountNumber, String state) {

        super(divisionName, accountNumber);

        this.state = state;
    }

    // Implement the abstract display method
    @Override
    public void display() {

        System.out.println("Domestic Division");
        System.out.println("-----------------");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
