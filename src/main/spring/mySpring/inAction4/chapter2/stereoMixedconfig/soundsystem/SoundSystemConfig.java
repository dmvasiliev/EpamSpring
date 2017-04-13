package mySpring.inAction4.chapter2.stereoMixedconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:mySpring/inAction4/chapter2/stereoMixedconfig/resources/cd-config.xml")
public class SoundSystemConfig {

}
