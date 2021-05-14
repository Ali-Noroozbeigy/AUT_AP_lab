package com.company;

import java.io.Serializable;

/**
 * a class for saving a note details
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Note implements Serializable {

    private String title;
    private String explanation;
    private String date;

    /**
     * constructor of class
     * @param title is title of note
     * @param explanation is explanation of note
     * @param date is the deadline
     */
    public Note(String title, String explanation, String date) {
        this.title = title;
        this.explanation = explanation;
        this.date = date;
    }

    /**
     * shows title of note
     * @return title of note
     */
    public String preview()
    {
        return title;
    }

    /**
     * shoes detail of note
     * @return detail of note
     */
    @Override
    public String toString() {
        return title + "\t" + explanation + "\t" +date +"\n";
    }
}
