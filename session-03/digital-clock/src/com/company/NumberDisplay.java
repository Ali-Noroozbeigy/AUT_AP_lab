package com.company;

/**
 * class for changing number and setting their values and limits
 */
public class NumberDisplay {

    private int limit;
    private int value;


    /**
     * sets the limit of each section of clock
     * @param limit is limit of section
     */
    public NumberDisplay(int limit)
    {
        this.limit=limit;
        this.value=0;
    }


    /**
     * returns the value of each section
     * @return value
     */
    public int getValue()
    {
        return this.value;
    }

    /**
     * a method for making time standard
     * @return a srting of time with standard shape
     */
    public String arrangeValue ()
    {
        if (value<10)
            return ("0"+value);
        else
            return (""+value);
    }


    /**
     * if value won't be 0 , setting the new value
     * @param newValue is the value we want to set
     */
    public void setValue(int newValue) {
        if (newValue <= limit && newValue >=0)
            this.value=newValue;
    }


    /**
     * increases the value of each time and make it 0 if reaches to limit
     */
    public void increment ()
    {
        value=(value+1)%limit;
    }

}
