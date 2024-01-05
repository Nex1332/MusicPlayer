package de.maksym.Controller;

import de.maksym.Music.ClassicMusic;
import de.maksym.Music.RockMusic;
import de.maksym.Music.RussianMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("de.maksym")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
