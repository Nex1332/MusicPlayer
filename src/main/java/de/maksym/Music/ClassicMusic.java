package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicMusic implements Music {
    private ArrayList<String> musicsList = new ArrayList<>();
    @Override
    public void getSong() {
        musicsList.add("Space Boy");
        musicsList.add("No One Sleep In Tokyo");
        musicsList.add("Hungarian Rhapsody");

        int idSong = (int) (Math.random()*3);

        System.out.println(musicsList.get(idSong));
    }
}
