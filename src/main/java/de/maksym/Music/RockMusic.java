package de.maksym.Music;

import de.maksym.Music.Interface.Music;
import org.springframework.stereotype.Component;

import java.util.*;

public class RockMusic implements Music {
    private final ArrayList<String> musicsList = new ArrayList<>();
    {
        musicsList.add("She Loves Me Not");
        musicsList.add("Before I Forget");
        musicsList.add("Lonely Day");
    }
    @Override
    public ArrayList<String> getSong() {
        return musicsList;
    }
}
