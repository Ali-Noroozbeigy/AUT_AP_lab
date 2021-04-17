package com.company;

import java.util.ArrayList;

/**
 * a class for saving shapes and printing all the details of shapes
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Paint {

    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Circle> circles;

    /**
     * constructor of class
     */
    public Paint()
    {
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
    }

    /**
     * a method to add a triangle to list
     * @param triangle is the triangle we want to add
     */
    public void addTriangle(Triangle triangle)
    {
        triangles.add(triangle);
    }


    /**
     * a method to add a triangle to list
     * @param rectangle is the rectangle we want to add
     */
    public void addRectangle(Rectangle rectangle)
    {
        rectangles.add(rectangle);
    }


    /**
     * a method to add a circle to list
     * @param circle is the circle we want to add
     */
    public void addCircle(Circle circle)
    {
        circles.add(circle);
    }


    /**
     * a method that draws all the shapes
     */
    public void drawAll()
    {
        for(Rectangle rectangle : rectangles)
            rectangle.draw();
        for (Triangle triangle : triangles)
            triangle.draw();
        for (Circle circle: circles)
            circle.draw();
    }

    /**
     * a method to print all the shapes
     */
    public void printAll()
    {
        for(Rectangle rectangle : rectangles)
            System.out.println(rectangle.toString());;
        for (Triangle triangle : triangles)
            System.out.println(triangle.toString());;
        for (Circle circle: circles)
            System.out.println(circle.toString());;
    }

}
