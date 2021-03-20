package com.company;


/**
 * a class that saves details about each song
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Song {

    //saves each song's style (jazz/hiphop/etc)
    private String style;

    //singer's name
    private String singer;

    //name of song
    private String nameOfSong;

    //length of song
    private String length;

    //address of song
    private String address;

    //year of production
    private String year;

    //is it favorite ?
    private boolean favorite;


    /**
     * a constructor to set each song's details
     * @param style is style of song
     * @param singer is name of singer
     * @param name is name of song
     * @param length is length of song
     * @param address is address of song
     * @param year is year of production of the song
     */
    public Song(String style, String singer, String name,
                String length, String address, String year)
    {
        this.style = style;
        this.singer = singer;
        this.nameOfSong = name;
        this.length = length;
        this.address = address;
        this.year = year;
        this.favorite = false;
    }


    /**
     * a method to return style
     * @return style of the song
     */
    public String getStyle() {
        return style;
    }

    /**
     * resets the style of song
     * @param style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * a method to return the singer of the song
     * @return name of the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * resets the name of singer
     * @param singer
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * returns the length of the song
     * @return length of song
     */
    public String getLength() {
        return length;
    }


    /**
     * for getting name of song
     * @return name of song
     */
    public String getNameOfSong() {
        return nameOfSong;
    }


    /**
     * resets name of song
     * @param nameOfSong
     */
    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    /**
     * getting address of song
     * @return address of song
     */
    public String getAddress() {
        return address;
    }


    /**
     * sets new address for song
     * @param address is the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * a getter for year
     * @return year of production
     */
    public String getYear() {
        return this.year;
    }


    /**
     * a setter for year
     * @param year is the new year
     */
    public void setYear(String year) {
        this.year = year;
    }


    /**
     * a method that shows if a song is favorite or not
     * @return favorite state
     */
    public boolean isFavorite() {
        return favorite;
    }

    /**
     * a method that changes the favorite
     * @param favorite is new state
     */
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    /**
     * a method to print details of a song
     */
    public void print ()
    {
        System.out.println("==========================");
        System.out.println(this.style);
        System.out.println(this.singer);
        System.out.println(this.nameOfSong);
        System.out.println(this.length);
        System.out.println(this.address);
        System.out.println(this.year);
        if (this.isFavorite())
            System.out.println("favorite");
        else
            System.out.println("not favorite");
        System.out.println("==========================");
    }
}
