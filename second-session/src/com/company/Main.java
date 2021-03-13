package com.company;


/**
 * this is main class of project
 * @author Ali_Nrb
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        University AmirKabir = new University("AmirKabir",3);

        AmirKabir.setDepartments();

        Department department = AmirKabir.getDepartment(0);

        Lab ap = department.makeLab(25,"Saturday");

        Student std = new Student("Ali","Norooz","9931062","CE",20);
        Student std2 = new Student("Bryan","Cranston","7859632","ChE",18);
        ap.enrollStudent(std);
        ap.enrollStudent(std2);
        ap.calculateAvg();
        ap.print();



    }
}
