package de.maksym.Controller;

import de.maksym.Music.Enum.MusicType;
import de.maksym.Music.Interface.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer  {
    private final Music rock;
    private final Music classical;
    private final Music russian;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music classical,
                       @Qualifier("rockMusic") Music rock,
                       @Qualifier("russianMusic") Music russian) {
        this.classical = classical;
        this.rock = rock;
        this.russian = russian;
    }

    public void playMusic(MusicType musicType) {
        switch (musicType) {
            case ROCK ->
                rock.getSong();
            case CLASSICAL ->
                classical.getSong();
            case RUSSIAN ->
                russian.getSong();
        }
    }
}
