package de.maksym;

import de.maksym.Controller.Computer;
import de.maksym.Music.Enum.MusicType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicType classical = MusicType.CLASSICAL;

        Computer computer = context.getBean("computer", Computer.class);
        computer.toString(classical);

        context.close();
    }
}
