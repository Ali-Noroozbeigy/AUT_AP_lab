package com.company;

import java.util.Scanner;

/**
 * main class of project
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Main {

    /**
     * delay 2.5 sec
     */
    static void sleep ()
    {
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * makes a note
     */
    static void makeNote()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nenter a title");
        String title = input.nextLine();
        System.out.println("\nenter an explanation");
        String explanation = input.nextLine();
        System.out.println("enter a date");
        String date = input.nextLine();

        FileUtil.write(title,explanation,date,"./notes/"+title+".txt");
        System.out.println("new note created!");
    }

    /**
     * reads a note
     */
    static void readNote ()
    {
        FileUtil.showNotes();
        System.out.println("\nenter the title you want to read");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();

        FileUtil.read("./notes/"+title+".txt");

    }

    /**
     * deletes a note
     */
    static void deleteNote()
    {
        FileUtil.showNotes();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the title you want to delete");
        String title = input.nextLine();
        FileUtil.deleteNote("./notes/"+title+".txt");
        System.out.println("note deleted!");
    }

    public static void main(String[] args) {

        int choose = -1;

        Scanner input = new Scanner(System.in);

        while (choose != 0)
        {
            System.out.println("\n1) create note");
            System.out.println("2) read note");
            System.out.println("3) delete note");
            System.out.println("0) quit\n");

            choose = input.nextInt();
            input.nextLine();

            switch (choose)
            {
                case 1:
                    makeNote();
                    sleep();
                    break;
                case 2 :
                    readNote();
                    sleep();
                    break;
                case 3 :
                    deleteNote();
                    sleep();
                    break;
                default:
                    break;
            }

        }

        System.out.println("good bye!");

    }
}
