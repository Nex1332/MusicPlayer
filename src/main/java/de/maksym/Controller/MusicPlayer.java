package de.maksym.Controller;

import de.maksym.Music.ClassicMusic;
import de.maksym.Music.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic){
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + rockMusic.getSong();
    }
}
