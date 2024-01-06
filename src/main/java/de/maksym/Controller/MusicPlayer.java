package de.maksym.Controller;

import de.maksym.Music.Interface.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer  {
    private final List<Music> genreList;


    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        Random random = new Random();

        int randomGenre = random.nextInt(3);
        int randomSong = random.nextInt(3);

        return genreList.get(randomGenre).getSong().get(randomSong);
    }
}
