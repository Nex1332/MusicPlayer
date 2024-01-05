package de.maksym;

import de.maksym.Controller.Computer;
import de.maksym.Controller.MusicPlayer;
import de.maksym.Music.ClassicMusic;
import java.util.ArrayList;
import java.util.List;
import de.maksym.Music.Interface.Music;
import de.maksym.Music.RockMusic;
import de.maksym.Music.RussianMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RussianMusic russianMusic(){
        return new RussianMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genreList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean List<Music> genreList() {
        List<Music> musicGenreList = new ArrayList<>();
        musicGenreList.add(classicMusic());
        musicGenreList.add(rockMusic());
        musicGenreList.add(russianMusic());

        return musicGenreList;
    }
}
