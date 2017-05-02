package core.classes.constructor;

/**
 * Created by Dmitry on 02.05.2017.
 */
public class Nasledovanie {
    public Nasledovanie(String a) {
        System.out.println("base");
    }
}

class NasledovanieChild extends Nasledovanie {

    public NasledovanieChild(String a) {
        super(a);
        System.out.println("child");
    }

}

class NasledovanieMain {
    public static void main(String[] args) {
        NasledovanieChild qaz = new NasledovanieChild("qaz");
    }
}
