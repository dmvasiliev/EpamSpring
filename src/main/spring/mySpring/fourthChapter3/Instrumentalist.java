package mySpring.fourthChapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
    public void perform() throws PerformanceException {
        instrument.play();
    }

    @Autowired
    private Instrument instrument;


    public Instrument getInstrument() {
        return instrument;
    }
}
