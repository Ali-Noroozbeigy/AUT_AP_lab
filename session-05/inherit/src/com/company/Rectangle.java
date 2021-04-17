package com.company;

import java.util.ArrayList;

/**
 * a class to create and manage rectangles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Rectangle extends Polygon {

    private ArrayList<Integer> sides;

    /**
     * constructor of class
     * @param a is first side
     * @param b is second side
     * @param c is third side
     * @param d is forth side
     */
    public Rectangle(int a, int b, int c, int d)
    {
        super(a,b,c,d);
        sides = super.getSides();
    }

    /**
     * a method to calculate perimeter of rectangle
     * @return perimeter of rectangle
     */
    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    /**
     * a method to calculate area of rectangle
     * @return area of rectangle
     */
    @Override
    public double calculateArea() {

        return sides.get(0) * sides.get(1) * 1.0;
    }

    /**
     * a method that draws rectangle
     */
    @Override
    public void draw() {
        System.out.println("rectangle, area :"+calculateArea()
        + "  perimeter :"+calculatePerimeter());
    }

    /**
     * equal method
     * @param obj is the we want to check
     * @return true if same else false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Rectangle))
            return false;

        Rectangle other = (Rectangle) obj;
        if (other.getSides().get(0)== sides.get(0)
        && other.getSides().get(1)==sides.get(1))
            return true;

        return false;
    }

    /**
     * method to convert a rectangle to string
     * @return string format of rectangle
     */
    @Override
    public String toString() {
        return ("rectangle : "+sides.get(0)+" "
        +sides.get(1) + " "+sides.get(2)+" "
        +sides.get(3));
    }

    /**
     * checks if a rectangle is square
     * @return true if be else false
     */
    public boolean isSquare()
    {
        return (sides.get(0) == sides.get(1));
    }
}
