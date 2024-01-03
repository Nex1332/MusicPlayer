package de.maksym.Music;

import de.maksym.Interface.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "She Loves Me Not";
    }
}
