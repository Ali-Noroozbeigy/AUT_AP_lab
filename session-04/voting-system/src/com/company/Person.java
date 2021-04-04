package com.company;

/**
 * this is person class which saves details of a person
 * who votes.
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Person {

    private String firstName;
    private String lastName;


    /**
     * constructor that makes a person with given information
     * @param firstName is first name of person
     * @param lastName is last name of person
     */
    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * getter for first name
     * @return first name of person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter for last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * a method that concats first name and last name of person
     * @return full name
     */
    public String toString()
    {
        return (firstName+" "+lastName);
    }

}
