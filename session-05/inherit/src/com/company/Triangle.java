package com.company;

import java.util.ArrayList;

/**
 * class to create and manage triangles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Triangle extends Polygon {

    private ArrayList<Integer> sides;

    /**
     * constructor of class
     * @param a is first side
     * @param b is second side
     * @param c is third
     */
    public Triangle(int a, int b, int c)
    {
        super(a,b,c);
        sides = super.getSides();
    }

    /**
     * method calculate perimeter
     * @return perimeter of triangle
     */
    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    /**
     * method to calculate area
     * @return area of triangle
     */
    @Override
    public double calculateArea() {
        double p = (sides.get(0)+sides.get(1)
                    + sides.get(2)) / 2;

        return Math.sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
    }

    @Override
    /**
     * a method that draw a triangle
     */
    public void draw() {
        System.out.println("triangle, area : "+calculateArea()
                           +"  perimeter : "+calculatePerimeter());
    }

    /**
     * equal method
     * @param obj is the we want to check
     * @return true if be else false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Triangle))
            return false;

        Triangle other = (Triangle) obj;
        if (other.getSides().get(0)== sides.get(0)
                && other.getSides().get(1)==sides.get(1)
                && other.getSides().get(2)==sides.get(2))
            return true;

        return false;
    }

    @Override
    /**
     * a method to convert triangle to string
     * @return string format of triangle
     */
    public String toString() {
        return ("triangle : "+sides.get(0)+" "
                +sides.get(1) + " "+sides.get(2));
    }

    /**
     * a method thta checks if a triangle is equilateral or not
     * @return true if be else false
     */
    public boolean isEquilateral()
    {
        return (sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2));
    }
}
