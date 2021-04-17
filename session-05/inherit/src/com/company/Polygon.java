package com.company;

import java.util.ArrayList;

/**
 * polygon class to create and manage polygons that inherits from Shape
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Polygon extends Shape {

    private ArrayList<Integer> sides;

    /**
     * constructor of class that saves sides of polygon
     * @param args are the sides of polygons
     */
    public Polygon (int... args)
    {
        super();
        sides = new ArrayList<>();
        for (int arg : args)
            sides.add(arg);
    }


    /**
     * getter method for sides of polygon
     * @return sides of polygon
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * a method to calculate perimeter of polygon
     * @return perimeter of polygon
     */
    @Override
    public double calculatePerimeter() {

        double peri = 0;

        for (int i = 0; i < sides.size(); i++) {

            peri += sides.get(i);

        }
        return peri;
    }

}
