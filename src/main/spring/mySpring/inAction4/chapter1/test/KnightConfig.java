package mySpring.inAction4.chapter1.test;

import mySpring.inAction4.chapter1.BraveKnight;
import mySpring.inAction4.chapter1.Knight;
import mySpring.inAction4.chapter1.Quest;
import mySpring.inAction4.chapter1.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(stream());
    }

    @Bean
    public PrintStream stream() {
        return new FakePrintStream();
    }

}
