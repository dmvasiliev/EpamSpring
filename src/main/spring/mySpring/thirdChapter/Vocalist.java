package mySpring.thirdChapter;


public class Vocalist implements Performer {
    public Vocalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Sings a " + song + "");
        System.out.println();
//        instrument.play();
    }

    private String song;

    public void setSong(String song) { //<co id="co_injectSong"/>
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}