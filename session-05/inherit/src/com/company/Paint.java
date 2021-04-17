package com.company;

import java.util.ArrayList;

/**
 * class for make painting
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Paint {

    private ArrayList<Shape> shapes;

    /**
     * constructor of class
     */
    public Paint()
    {
        shapes = new ArrayList<>();
    }

    /**
     * adds a shape to list
     * @param shape is the shape we want to add
     */
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }

    /**
     * draws all the elements of list
     */
    public void drawAll()
    {
        for (Shape shape : shapes)
            shape.draw();
    }

    /**
     * prints all the elements of list
     */
    public void printAll()
    {
        for (Shape shape : shapes)
            System.out.println(shape);
    }

    /**
     * determines squares and equal side triangles
     */
    public void describeEqualSides()
    {
        for (Shape shape : shapes)
        {
            if (shape instanceof Rectangle)
            {
                Rectangle r = (Rectangle) shape;
                if (r.isSquare())
                    System.out.println(r);
            }
            else if (shape instanceof Triangle)
            {
                Triangle t = (Triangle) shape;
                if (t.isEquilateral())
                    System.out.println(t);
            }
        }
    }

}
