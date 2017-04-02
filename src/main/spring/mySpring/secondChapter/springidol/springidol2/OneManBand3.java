package mySpring.secondChapter.springidol.springidol2;

import mySpring.secondChapter.springidol.PerformanceException;
import mySpring.secondChapter.springidol.Performer;

import java.util.Properties;

public class OneManBand3 implements Performer {
    public OneManBand3() {
    }

    public void perform() throws PerformanceException {
        for (String key : instruments.stringPropertyNames()) {
            System.out.print(key + " : ");
            String instrument = instruments.getProperty(key);
            System.out.print(instrument + "\n");
        }
    }

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}