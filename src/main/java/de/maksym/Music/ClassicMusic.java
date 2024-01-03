package de.maksym.Music;

import de.maksym.Interface.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
