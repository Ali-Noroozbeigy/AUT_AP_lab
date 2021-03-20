package com.company;


/**
 * the main class of project
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        ClockDisplay digitalClock = new ClockDisplay(3,59,43);

        for (int i=0; i<10000;i++)
        {
            digitalClock.timeTick();
            System.out.println(digitalClock.getTime());
        }

    }
}
