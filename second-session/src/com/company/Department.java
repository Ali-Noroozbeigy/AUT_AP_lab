package com.company;

/**
 * this class is for making objects as department
 * @author Ali_Nrb
 * @version 1
 */
public class Department {

    private String depName;


    /**
     * a constructor for naming a department
     * @param name is department name
     */
    public Department (String name)
    {
        this.setDepName(name) ;
    }


    /**
     * it will set the name of department
     * @param depName as department name
     */

    public void setDepName(String depName) {
        this.depName = depName;
    }


    /**
     * method for getting a department name
     * @return name of department
     */
    public String getDepName()
    {
        return depName;
    }


    /**
     * this method will make a new lab for
     * a specific department
     * @param cap is capacity of lab
     * @param day is day of lab
     * @return a new lab
     */
    public Lab makeLab (int cap , String day)
    {
        Lab newLab = new Lab(cap,day);
        return newLab;
    }

}
