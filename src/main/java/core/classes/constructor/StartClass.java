package core.classes.constructor;

/**
 * Created by Dmitry on 02.05.2017.
 */
public class StartClass {

    public static void main(String[] args) {
        Subb subb = new Subb();
    }
}

class Bases {
    Bases() {
        System.out.println("Base c-tor");
    }
}

class Subb extends Bases {
    Subb() {
        System.out.println("Sub c-tor");
    }
}
