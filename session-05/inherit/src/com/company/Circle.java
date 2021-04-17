package com.company;

/**
 * a class to create and manage circles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Circle extends Shape{

    private int radius;

    /**
     * constructor of class
     * @param radius is radius of class
     */
    public Circle (int radius)
    {
        super();
        this.radius = radius;
    }

    /**
     * getter method for radius
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * a method that calculate perimeter of circle
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    /**
     * a method that calculate area of circle
     * @return area
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * a method to draw circle
     */
    @Override
    public void draw() {
        System.out.println("circle, area : "+calculateArea()
                           + "  perimeter : "+ calculatePerimeter());
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
        if (!(obj instanceof Circle))
            return false;

        Circle other = (Circle) obj;

        if (other.getRadius() == this.getRadius())
            return true;

        return false;
    }

    /**
     * a method to convert circle to string
     * @return string format of circle
     */
    @Override
    public String toString() {
        return ("circle, radius :"+getRadius());
    }
}
