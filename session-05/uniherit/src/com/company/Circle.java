package com.company;

/**
 * a class to create and manage circles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Circle {

    private int radius;

    /**
     * constructor of class
     * @param radius is the radius of circle
     */
    public Circle(int radius)
    {
        this.radius = radius;
    }

    /**
     * getter method to get radius
     * @return radius of circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * a method that calculates perimeter od circle
     * @return perimeter of circle
     */
    public double calculatePerimeter()
    {
        return 2* Math.PI * radius;
    }

    /**
     * a method to calculate area of circle
     * @return area of circle
     */
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * a method that draws circles
     */
    public void draw()
    {
        System.out.println("circle, area :"+calculateArea()
        + "  perimeter : "+calculatePerimeter());
    }

    /**
     * overriden equals method to check equality
     * @param obj is the object we want to check
     * @return true if equal else false
     */
    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;
        if(!(obj instanceof Triangle))
            return false;

        Circle other = (Circle) obj;

        if (radius == other.getRadius())
            return true;

        return false;
    }

    /**
     * overriden toString method
     * @return string of circle
     */
    @Override
    public String toString() {

        return ("circle, "+getRadius());
    }
}
