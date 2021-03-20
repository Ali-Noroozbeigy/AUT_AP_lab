package com.company;

/**
 * this class is for playing musics
 * and show if a song is playing or not
 * @author Ali Noroozbeigy
 * @version 1
 */
public class MusicPlayer {

    //if a music is playing it will be true
    private boolean isPlaying;

    /**
     * a constructor for the class that says that there isn't
     * any music playing now
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * a method that starts playing a given song
     * @param song is the song we want to play
     */
    public void start(Song song)
    {
        isPlaying = true;
        System.out.println(song.getNameOfSong() + "  is playing...");
    }

    /**
     * a method that stops a song from playing
     */
    public void stop ()
    {
        System.out.println("player has stopped!");
        isPlaying = false;
    }

}
