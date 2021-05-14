package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * main class of project
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Main {

    /**
     * this method delays 2.5 sec
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
     * this method checks a file is empty or not
     * mainly will be used in first run
     * @return true if file is empty else false
     */
    static boolean fileIsEmpty()
    {
        File file = new File("notes.ser");
        if (file.length()==0)
            return true;
        else
            return false;
    }

    /**
     * make a new note to be saved in notes list
     * @param notes is list of notes
     */
    static void makeNote(ArrayList<Note> notes)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nenter a title");
        String title = input.nextLine();
        System.out.println("\nenter an explanation");
        String explanation = input.nextLine();
        System.out.println("enter a date");
        String date = input.nextLine();

        notes.add(new Note(title,explanation,date));
        System.out.println("new note created!");
    }


    /**
     * prints all available notes
     * @param notes is list of notes
     */
    static void showNotes(ArrayList<Note> notes)
    {
        for (int i = 0; i < notes.size(); i++)
            System.out.println((i+1)+")"+notes.get(i).preview());
    }


    /**
     * prints the detail of a note
     * @param notes is list of notes
     */
    static void readNote(ArrayList<Note> notes)
    {
        showNotes(notes);

        System.out.println("enter index of note");
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();

        System.out.println(notes.get(index-1));

    }

    /**
     * will delete a note from list
     * @param notes is list of notes
     */
    static void deleteNote(ArrayList<Note> notes)
    {
        showNotes(notes);
        System.out.println("enter index to delete");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        notes.remove(index-1);
        System.out.println("note deleted!");
    }

    public static void main(String[] args) {

        ArrayList<Note> notes;

        if (fileIsEmpty())
            notes = new ArrayList<>();
        else
            notes = (ArrayList<Note>)FileUtil.getNotes();

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
                    makeNote(notes);
                    sleep();
                    break;
                case 2 :
                    readNote(notes);
                    sleep();
                    break;
                case 3 :
                    deleteNote(notes);
                    sleep();
                    break;
                default:
                    break;
            }
        }

        FileUtil.write(notes);
        System.out.println("good bye!");


    }
}
