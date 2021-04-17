package com.company;

/**
 * main class of project
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,4,5,4);
        Rectangle r2 = new Rectangle(5,5,5,5);

        r1.draw();
        r2.draw();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r1.equals(r2));
        System.out.println("================");

        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(3,3,3);
        t1.draw();
        t2.draw();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.isEquilateral());
        System.out.println(t2.isEquilateral());
        System.out.println(t1.equals(t2));
        System.out.println("================");

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(5);
        c1.draw();
        c2.draw();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        System.out.println("================");

        Paint paint = new Paint();
        paint.addShape(r1);
        paint.addShape(r2);
        paint.addShape(t1);
        paint.addShape(t2);
        paint.addShape(c1);
        paint.addShape(c2);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();

    }
}
