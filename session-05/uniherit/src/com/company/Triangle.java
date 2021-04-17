package com.company;

/**
 * a class to create and manage triangles
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Triangle {

    private int[] sides = new int[3];

    /**
     * constructor of class
     * @param a is first side
     * @param b is second side
     * @param c is third side
     */
    public Triangle (int a, int b, int c)
    {
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
    }

    /**
     * getter method for sides of triangle
     * @return arrays of sides
     */
    public int[] getSides() {

        return sides;

    }

    /**
     * checks if triangle is equilateral or not
     * @return ture if be else false
     */
    public boolean isEquilateral()
    {
        return sides[0]==sides[1] && sides[1]==sides[2];
    }

    /**
     * a method to calculate perimeter of triangle
     * @return perimeter of triangle
     */
    public int calculatePerimeter()
    {
        int peri = 0;

        for (int i = 0; i < 3; i++) {

            peri+=sides[i];
        }

        return  peri;
    }

    /**
     * a method to calculate area of triangle
     * @return area of triangle
     */
    public double calculateArea()
    {
        double p = (sides[0]+sides[1]+sides[2])/2;

        return (Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2])));
    }

    /**
     * a method to draw triangles
     */
    public void draw()
    {
        System.out.println("triangle, area : "+calculateArea()
                +"  perimeter :"+calculatePerimeter());
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

        Triangle other = (Triangle)obj;

        int[] s = other.getSides();


        if (sides[0] == s[0] && sides[1]==s[1] && sides[2]==s[2])
            return true;

        return false;
    }

    /**
     * overriden toString method to print triangle
     * @return string of triangle
     */
    @Override
    public String toString() {
        return ("triangle : "+sides[0]+" "+
                sides[1]+" "+sides[2]);
    }
}
