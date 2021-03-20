package com.company;

public class Main {

    public static void main(String[] args) {

        MusicCollection jazz = new MusicCollection();
        jazz.addSong("jazz","Seb","LaLa Land","3:20","E://Song","2015");
        jazz.addSong("jazz","Joe","Soul","5:10","E://Songs","2020");

        /*System.out.println(jazz.getNumberOfSongs());
        jazz.showDetailOfSong(1);
        jazz.showDetailOfSong(2);

        jazz.listSongs();

        jazz.removeSong(1);*/

        jazz.startMusic(1);
        jazz.stopMusic();



        /*jazz.addFavorite(1);
        jazz.addFavorite(0);
        jazz.showFavoriteSongs();
        jazz.removeFavorite(1);
        jazz.showFavoriteSongs();*/


        /*jazz.searchSinger("S");
        jazz.searchAddress("E://Song");*/
    }
}
