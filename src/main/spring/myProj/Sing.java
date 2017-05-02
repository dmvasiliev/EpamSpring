package myProj;

/**
 * Created by Dmitry on 01.05.2017.
 */
public class Sing {
    private static Sing ourInstance = new Sing();

    public static Sing getInstance() {
        return ourInstance;
    }

    private Sing() {
    }
}
