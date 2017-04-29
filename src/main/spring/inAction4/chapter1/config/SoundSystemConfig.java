package inAction4.chapter1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "inAction4.chapter1.out",
        excludeFilters = {@Filter(Configuration.class)})
public class SoundSystemConfig {
}
