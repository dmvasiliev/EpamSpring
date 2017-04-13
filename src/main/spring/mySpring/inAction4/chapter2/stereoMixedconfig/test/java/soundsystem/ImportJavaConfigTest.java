package mySpring.inAction4.chapter2.stereoMixedconfig.test.java.soundsystem;

import mySpring.inAction4.chapter2.stereoMixedconfig.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mySpring/inAction4/chapter2/stereoMixedconfig/resources/cdplayer-config.xml")
public class ImportJavaConfigTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;


    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
                log.getLog());
    }

}
