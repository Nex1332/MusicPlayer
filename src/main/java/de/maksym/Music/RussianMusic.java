package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class RussianMusic implements Music {
    private final ArrayList<String> musicsList = new ArrayList<>();
    {
        musicsList.add("17 let");
        musicsList.add("Perezvonii");
        musicsList.add("Sistema");
    }
    @Override
    public ArrayList<String> getSong() {
        return musicsList;
    }
}
