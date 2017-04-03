package mySpring.thirdChapter;

/**
 * Created by Dmitry on 02.04.2017.
 */
public abstract class Instrumentalist2 implements Performer {
    public Instrumentalist2() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        getInstrument().play(); // Используется внедряемый метод
    } // getInstrument()

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument(); // Внедряемый метод
}