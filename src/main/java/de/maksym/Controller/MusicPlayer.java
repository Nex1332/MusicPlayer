package de.maksym.Controller;

import de.maksym.Music.Enum.MusicType;
import de.maksym.Music.Interface.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer  {
    private final Music music;
    private final Music music1;
    private final Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music1,
                       @Qualifier("rockMusic") Music music,
                       @Qualifier("russianMusic") Music music2) {
        this.music1 = music1;
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(MusicType musicType) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        switch (musicType) {
            case ROCK -> {
                return music.getSong().get(randomNumber);
            }
            case CLASSICAL -> {
                return music1.getSong().get(randomNumber);
            }
            case RUSSIAN -> {
                return music2.getSong().get(randomNumber);
            }
        }

        return "There`s no song";
    }
}
