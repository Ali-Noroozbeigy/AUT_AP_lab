package com.company;

/**
 * super class shape that introduces some method to be overriden
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Shape {

    /**
     * a method that calculates perimeter of shape
     * @return perimeter of shape
     */
    public double calculatePerimeter()
    {
        double p = 0;
        return p;
    }

    /**
     * a method that calculates area of shape
     * @return area of shape
     */
    public double calculateArea()
    {
        double s = 0;
        return s;
    }

    /**
     * a method that draws shapes
     */
    public void draw ()
    {
        System.out.println("not particular shape");
    }

    /**
     * equal method to check equality
     * @param obj is the we want to check
     * @return true if same else false
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * a method to convert a shape to string
     * @return string type of a shape
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
