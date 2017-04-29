package inAction4.chapter1.config;

import inAction4.chapter1.BraveKnight;
import inAction4.chapter1.Knight;
import inAction4.chapter1.Quest;
import inAction4.chapter1.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
