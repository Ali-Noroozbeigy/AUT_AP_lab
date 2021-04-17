package com.company;

/**
 * a class to create and manage rectangles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Rectangle {

    private int[] sides = new int[4];


    /**
     * constructor of class that set the sides of rectangles
     * @param a is first side
     * @param b is second side
     * @param c is third side
     * @param d is forth side
     */
    public Rectangle(int a, int b, int c, int d)
    {
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
        sides[3] = d;
    }

    /**
     * getter method for sides of rectangle
     * @return an array that contains sides of rectangle
     */
    public int[] getSides() {

        return sides;

    }

    /**
     * a method to determine if a rectangle is square or not
     * @return true if it is square else false
     */
    public boolean isSquare()
    {
        return sides[0]== sides[1] && sides[1]==sides[2]
                && sides[2]==sides[3];
    }

    /**
     * a method to calculate perimeter of rectangle
     * @return the perimeter of rectangle
     */
    public int calculatePerimeter()
    {
        int peri = 0;

        for (int i = 0; i < 4; i++) {

            peri+=sides[i];
        }

        return  peri;
    }

    /**
     * a method to calculate area of a rectangle
     * @return area of rectangle
     */
    public int calculateArea()
    {
        return sides[0] * sides[1];
    }

    /**
     * a method to draw a rectangle
     */
    public void draw()
    {
        System.out.println("rectangle, area : "+calculateArea()
                +"  perimeter :"+calculatePerimeter());
    }

    /**
     * overriden equals method to compare rectangles
     * @param obj is the object we want to compare
     * @return true if object has exact sides like this and false if not
     */
    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;
        if(!(obj instanceof Rectangle))
            return false;

        Rectangle other = (Rectangle)obj;

        int[] s = other.getSides();

        if (sides[0]==s[0] && sides[1]==s[1])
            return true;

        return false;
    }

    /**
     * overriden toString method to print details of rectangle
     * @return string of rectangle
     */
    @Override
    public String toString() {
        return ("rectangle : "+sides[0]+" "+
                sides[1]+" "+sides[2]+" "+sides[3]);
    }
}
