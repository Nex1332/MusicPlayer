package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicMusic implements Music {
    private final ArrayList<String> musicsList = new ArrayList<>();
    {
        musicsList.add("Space Boy");
        musicsList.add("No One Sleep In Tokyo");
        musicsList.add("Hungarian Rhapsody");
    }
    @Override
    public ArrayList<String> getSong() {
        return musicsList;
    }
}
