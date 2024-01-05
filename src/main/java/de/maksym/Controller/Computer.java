package de.maksym.Controller;

import de.maksym.Music.Enum.MusicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void toString(MusicType musicType) {
        System.out.println("Computer " + id + " is Playing: " + musicPlayer.playMusic(musicType));
    }
}
