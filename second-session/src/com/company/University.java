package com.company;
import java.util.Scanner;

/**
 * this class makes objects as university
 * @author Ali_Nrb
 * @version 1
 */

public class University {

    private String uniName;
    private int numDeps;
    private Department[] departments;

    /**
     * a constructor for giving a name to the university
     * and also getting number of departments
     * @param name is for university name
     * @param numDep is number of departments each university has
     */
    public University (String name , int numDep)
    {
        this.setUniName(name);
        this.setNumDeps(numDep);
        departments = new Department[this.getNumDeps()];
    }


    /**
     * it will set university name
     * @param uniName as university name
     */
    public void setUniName(String uniName) {
        this.uniName = uniName;
    }


    /**
     * name of uinversity
     * @return name of university
     */
    public String getUniName() {
        return uniName;
    }


    /**
     * sets number of departments each university has
     * @param numDeps
     */
    public void setNumDeps(int numDeps) {
        this.numDeps = numDeps;
    }


    /**
     * returns number of departments
     * @return number of departments
     */
    public int getNumDeps() {
        return numDeps;
    }

    /**
     * a method to set the departments and setting a name for them
     */
    public void setDepartments ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter departments' name");

        for (int i =0 ; i<departments.length ; i++)
        {
            String name = scanner.nextLine();
            departments[i] = new Department(name);
        }
    }


    /**
     * this method will return the ith department
     * @param i is i'th index
     * @return i'th department
     */
    public Department getDepartment(int i)
    {
        return departments[i];
    }

    /**
     * a method to print departments name
     */
    public void printDepartments ()
    {
        for (int i=0 ; i<departments.length ; i++)
        {
            System.out.println(departments[i].getDepName());
        }
    }




}
