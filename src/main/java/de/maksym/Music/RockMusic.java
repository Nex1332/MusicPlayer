package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class RockMusic implements Music {
    private ArrayList<String> musicsList = new ArrayList<>();
    @Override
    public void getSong() {
        musicsList.add("She Loves Me Not");
        musicsList.add("Before I Forget");
        musicsList.add("Lonely Day");

        int idSong = (int) (Math.random()*2);

        musicsList.get(idSong);
    }
}
