package de.maksym.Controller;

import de.maksym.Music.Enum.MusicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void toPrint(MusicType musicType) {
        System.out.println("Computer " + id + " is Playing: " );
        musicPlayer.playMusic(musicType);
    }
}
