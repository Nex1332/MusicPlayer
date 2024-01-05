package de.maksym;

import de.maksym.Controller.Computer;
import de.maksym.Controller.SpringConfig;
import de.maksym.Music.Enum.MusicType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicType classical = MusicType.CLASSICAL;

        Computer computer = context.getBean("computer", Computer.class);
        computer.toString(classical);

        context.close();
    }
}
