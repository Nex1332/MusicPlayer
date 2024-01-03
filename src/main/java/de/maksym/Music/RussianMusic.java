package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RussianMusic implements Music {
    private ArrayList<String> musicsList = new ArrayList<>();
    @Override
    public void getSong() {
        musicsList.add("17 let");
        musicsList.add("Perezvonii");
        musicsList.add("Sistema");

        int idSong = (int) (Math.random()*2);

        musicsList.get(idSong);
    }
}
