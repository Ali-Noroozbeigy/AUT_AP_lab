package com.company;


/**
 * this shows information about lab
 * @author Ali_Nrb
 * @version 1
 */
public class Lab {

    private Student[] students ;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize=0;


    /**
     * this is constructor
     * sets the information about lab
     * @param cap capacity
     * @param d day
     */
    public Lab (int cap , String d)
    {
        this.setCapacity(cap);
        this.setDay(d);
        students = new Student[cap];
    }






    /**
     * this method will enroll a student
     * @param std student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * sets the capacity
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * returns the capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets the day
     * @param day day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * returns the day
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * returns the average
     * @return average
     */
    public int getAvg() {
        return avg;
    }

    /**
     * sets the students array
     * @param students students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * returns students array
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * will calculate average
     */
    public void calculateAvg()
    {
        int sum=0;
        for (int i=0;i< currentSize;i++)
        {
            sum += students[i].getGrade();
        }
        avg = sum / currentSize ;
    }


    /**
     * returns the current size of Lab
     * @return currentSize
     */
    public int getCurrentSize(){
        return currentSize ;
    }



    /**
     * prints information about students lab
     */
    public void print ()
    {
        for (int i =0 ; i < currentSize ; i++)
        {
            System.out.println(students[i].getFirstName());
            System.out.println(students[i].getLastName());
            System.out.println(students[i].getID());
            System.out.println(students[i].getGrade());
            System.out.println(students[i].getMajor());
            System.out.println();
        }
        System.out.println(this.getAvg());
        System.out.println(this.getDay());
    }
}
