package com.company;

/**
 * main class of project where we can paint!
 * @author Ali Noroozzbeigy
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        Paint paint = new Paint();

        Rectangle r1 = new Rectangle(5,4,5,4);
        Rectangle r2 = new Rectangle(5,5,5,5);


        r1.draw();
        r2.draw();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r1.equals(r2));
        System.out.println("==================");


        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(2,2,2);

        t1.draw();
        t2.draw();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.isEquilateral());
        System.out.println(t2.isEquilateral());
        System.out.println(t1.equals(t2));
        System.out.println("==================");


        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);

        c1.draw();
        c2.draw();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        System.out.println("==================");

        paint.addRectangle(r1);
        paint.addRectangle(r2);
        paint.addTriangle(t1);
        paint.addTriangle(t2);
        paint.addCircle(c1);
        paint.addCircle(c2);
        paint.drawAll();
        paint.printAll();


    }
}
