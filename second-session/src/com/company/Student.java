package com.company;

/**
 *  this class shows information about each
 *  student
 * @author Ali_Nrb
 * @version 1
 */

public class Student {

    // student first name
    private String firstName ;

    // student last name
    private String lastName ;

    // student ID
    private String ID ;

    // student marks
    private int grade ;

    // field of study
    private String major ;


    /**
     * this is constructor
     * this will be create new students with the given information
     * @param fname is for first name
     * @param lname is for last name
     * @param id is for ID
     * @param majstd is for major
     */
    public Student (String fname , String lname , String id, String majstd,int mark)
    {
       this.setFirstName(fname) ;
       this.setLastName(lname) ;
       this.setID(id);
       this.setMajor(majstd) ;
       this.setGrade(mark) ;
    }

    /**
     * this will set the first name of student
     * @param fname first name
     */
    public void setFirstName (String fname)
    {
        this.firstName = fname ;
    }

    /**
     * this will return first name of student
     * @return firstName
     */
    public String getFirstName ()
    {
        return firstName;
    }


    /**
     * this will set the last name of student
     * @param lname last name
     */
    public void setLastName (String lname)
    {
        this.lastName = lname ;
    }

    /**
     * this will return last name of student
     * @return LastName
     */
    public String getLastName ()
    {
        return lastName;
    }


    /**
     * this will set the ID of student
     * @param Id ID
     */
    public void setID (String Id)
    {
        this.ID = Id ;
    }

    /**
     * this will return ID student
     * @return ID
     */
    public String getID ()
    {
        return ID;
    }




    /**
     * this method will set the given mark as grade of student
     * @param mark
     */
    public void setGrade (int mark)
    {
        this.grade = mark ;
    }

    /**
     * this method will return the grade of student
     * @return grade
     */
    public int getGrade ()
    {
        return grade ;
    }

    /**
     * this will set the major of student
     * @param majstd major
     */
    public void setMajor (String majstd)
    {
        major = majstd ;
    }

    /**
     * this will return major of student
     * @return major
     */
    public String getMajor ()
    {
        return major;
    }

    /**
     * this method will print information about student
     */
    public void print ()
    {
        System.out.println(this.getFirstName()+" " + this.getLastName() +
                ":" + this.getID() + " " +" " + this.getMajor() +" " + this.getGrade());
    }

}
