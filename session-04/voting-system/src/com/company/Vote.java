package com.company;

/**
 * class vote that saves the information of voter and date
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Vote {

    Person person;
    String date;

    /**
     * constructor for making a new vote
     * @param person is the voter
     * @param date is date of voting
     */
    public Vote(Person person, String date)
    {
        this.person = person;
        this.date = date;
    }

    /**
     * getter for person
     * @return the voter
     */
    public Person getPerson() {
        return person;
    }

    /**
     * getter for date
     * @return date of vote
     */
    public String getDate() {
        return date;
    }


}
