package mySpring.fourthChapter2.springidol;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("stringed")
public class Guitar implements Instrument {
    public Guitar() {
    }

    public void play() {
        System.out.println("Guitar Guitar Guitar");
    }
}