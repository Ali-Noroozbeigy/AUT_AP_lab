package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * a class for manages working with files
 * @author Ali Noroozbeigy
 * @version 1
 */
public class FileUtil {

    /**
     * static write method which writes the notes arrayList to file
     * @param notes is list of notes
     */
    public static void write (ArrayList<Note> notes)
    {

        try (FileOutputStream fos = new FileOutputStream("notes.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(notes);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * static method for getting notes
     * @return list of notes
     */
    public static Object getNotes ()
    {
        try(FileInputStream fis = new FileInputStream("notes.ser");
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
            return ois.readObject();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace(System.err);
            return null;
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
            return null;
        }
    }

}
