package com.company;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    /**
     * writes the details to a file
     * @param title is title of note
     * @param explanation is explanation of note
     * @param date is deadline
     * @param path is file path
     */
    public static void write (String title, String explanation, String date, String path)
    {
        try(FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write(title);
            bw.write("\t");
            bw.write(explanation);
            bw.write("\t");
            bw.write(date);
            bw.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * reads a note from file
     * @param path is file path
     */
    public static void read (String path)
    {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr))
        {
            char [] buffer = new char[2048];
            int count;
            while (br.ready())
            {
                count = br.read(buffer);
                System.out.println(new String(buffer,0,count));
            }
        }

        catch (IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    /**
     * shows all the notes
     */
    public static void showNotes()
    {
        Path path = Paths.get("./notes");
        try
        {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
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
     * deletes a note
     * @param path is file path
     */
    public static void deleteNote(String path)
    {
        File file = new File(path);

        file.delete();
    }
}
