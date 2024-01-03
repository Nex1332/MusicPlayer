package de.maksym.Music;

import de.maksym.Interface.Music;
import org.springframework.stereotype.Component;

@Component
public class RussianMusic implements Music {
    @Override
    public String getSong() {
        return "17 Let";
    }
}
