package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * class which manages working with files
 * @author Ali Noroozbeigy
 * @version 1
 */
public class FileUtil {

    /**
     * static write method which saves the note
     * @param title is title of notes
     * @param explanation is explanation of note
     * @param date is deadline
     * @param path is file path
     */
    public static void write (byte[] title,byte[] explanation, byte[] date, String path)
    {
        try (FileOutputStream fos = new FileOutputStream(path))
        {
            fos.write(title);
            fos.write("\t".getBytes());
            fos.write(explanation);
            fos.write("\t".getBytes());
            fos.write(date);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }


    /**
     * static read method which reads notes
     * @param path is file path
     */
    public static void read (String path)
    {
        try(FileInputStream fin = new FileInputStream(path))
        {
            int c;
            while ((c = fin.read()) != -1)
            {
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * static show method shows all notes in directory
     */
    public static void showNotes()
    {
        Path path = Paths.get("./notes");
        try
        {
            DirectoryStream <Path> directoryStream = Files.newDirectoryStream(path);
            for (Path p : directoryStream)
            {
                System.out.println(p);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * static delete method which deletes a note
     * @param path is file path
     */
    public static void deleteNote(String path)
    {
        File file = new File(path);

        file.delete();
    }

}
