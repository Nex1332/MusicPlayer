package de.maksym.Controller;

import de.maksym.Music.Enum.MusicType;
import de.maksym.Music.Interface.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer  {
    private final Music music;
    private final Music music1;
    private final Music music2;

    public MusicPlayer(List<Music> genreList) {
        this.music = genreList.get(0);
        this.music1 = genreList.get(1);
        this.music2 = genreList.get(2);
    }

    public String playMusic(MusicType musicType) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        switch (musicType) {
            case CLASSICAL -> {
                return music.getSong().get(randomNumber);
            }
            case ROCK -> {
                return music1.getSong().get(randomNumber);
            }
            case RUSSIAN -> {
                return music2.getSong().get(randomNumber);
            }
        }

        return "There`s no song";
    }
}
