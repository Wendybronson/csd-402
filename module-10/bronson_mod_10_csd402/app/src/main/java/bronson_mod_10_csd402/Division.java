/*
 * Name: Wendy Bronson
 * Date: October 1, 2026
 * Assignment: Module 10.2 Programming Assignment
 * File: Division.java
 * Purpose: Create an abstract superclass that stores
 *          division information for the subclasses.
 */

package bronson_mod_10_csd402;

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor requires both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method implemented by each subclass
    public abstract void display();
}
