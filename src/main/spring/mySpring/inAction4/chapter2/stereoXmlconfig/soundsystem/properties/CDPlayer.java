package mySpring.inAction4.chapter2.stereoXmlconfig.soundsystem.properties;

import mySpring.inAction4.chapter2.stereoXmlconfig.soundsystem.CompactDisc;
import mySpring.inAction4.chapter2.stereoXmlconfig.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
