package com.company;


import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;

import java.util.Iterator;

/**
 * a class to save songs of each music style
 * @author Ali Noroozbeigy
 * @version 1
 */
public class MusicCollection {

    // an arrayList for saving songs that are same in style
    private ArrayList<Song> songs = new ArrayList<Song>();

    //a music player
    private MusicPlayer player;


    /**
     * simple constructor that makes a player
     */
    public MusicCollection() {

        player = new MusicPlayer();

    }


    /**
     * a method to add new song to the collection
     * @param style is style of song
     * @param singer is singer of song
     * @param name is name of song
     * @param length is length of song
     * @param address is address of song
     */
    public void addSong (String style, String singer,String name,
                         String length, String address, String year)
    {
        Song song = new Song(style,singer,name,length,address,year);
        songs.add(song);
    }


    /**
     * a method to get number of files
     * in the category
     * @return number of files
     */
    public int getNumberOfSongs()
    {
        return songs.size();
    }


    /**
     * a method to check whether an index is valid or not
     * @param i is the index
     * @return validity of index
     */
    private boolean isValidIndex (int i)
    {
        if (i<songs.size() && i>=0)
            return true;
        else
            return false;
    }


    /**
     * shows details of a specific song
     * @param i is the song's index
     */
    public void showDetailOfSong (int i)
    {
        if (this.isValidIndex(i))
        {
            songs.get(i).print();
        }
        else
            System.out.println("wrong index !");
    }


    /**
     * prints all of songs that are in the category
     */
    public void listSongs ()
    {
        Iterator<Song> songIterator = songs.iterator();
        while (songIterator.hasNext())
        {
            songIterator.next().print();
        }
    }


    /**
     * a method for removing a song from category
     * by using an iterator
     * @param i is the index we want to delete
     */
    public void removeSong (int i)
    {
        if(isValidIndex(i))
        {
            Iterator<Song> songDeleter = songs.iterator();
            int k=0;
            while (songDeleter.hasNext())
            {
                songDeleter.next();
                if (k==i)
                {
                    songDeleter.remove();
                    break;
                }
                k++;
            }
        }
        else
            System.out.println("wrong index !");
    }


    /**
     * a method that adds a song in favorite list
     * @param i is index of the song
     */
    public void addFavorite(int i)
    {
       if (isValidIndex(i))
       {
           songs.get(i).setFavorite(true);
       }
       else
           System.out.println("wrong index !");
    }

    /**
     * a method that removes a song from
     * favorite list
     * @
     */
    public void removeFavorite(int i)
    {
        if (isValidIndex(i))
            songs.get(i).setFavorite(false);
        else
            System.out.println("wrong index !");
    }



    /**
     * a method for printing favorite songs of a category
     */
    public void showFavoriteSongs()
    {
        for (Song s : songs)
        {
            if (s.isFavorite())
            {
                System.out.println("==============");
                System.out.println(s.getNameOfSong());
                System.out.println("==============");
            }
        }
    }


    /**
     * a method that searchs in singers names
     * and prints all of the song that their
     * singers name contains given string
     * @param name is the name of singer
     */
    public void searchSinger (String name)
    {
        for (Song song : songs)
        {
            if(song.getSinger().contains(name))
            {
                System.out.println(song.getNameOfSong());
                System.out.println(song.getSinger());
                System.out.println("================");
            }
        }
    }

    /**
     * a method that searches in songs address
     * and shows the songs in the given directory
     * @param address is the directory
     */
    public void searchAddress (String address)
    {
        for (Song song : songs)
        {
            if(song.getAddress().contains(address))
            {
                System.out.println(song.getNameOfSong());
                System.out.println(song.getSinger());
                System.out.println("================");
            }
        }
    }

    /**
     * a method that starts playing a song
     * @param i is the index of song we want to play
     */
    public void startMusic (int i)
    {
        if (isValidIndex(i))
            player.start(songs.get(i));
        else
            System.out.println("wrong input !");
    }

    /**
     * a method that stops the player
     */
    public void stopMusic()
    {
            player.stop();
    }
}
