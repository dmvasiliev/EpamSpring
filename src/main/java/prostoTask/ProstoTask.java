package prostoTask;

/**
 * Created by VasDA on 25.07.2016.
 */
public class ProstoTask {
    static {
        System.out.println("I'm static block");
    }

    {
        System.out.println("Пива давай");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new ProstoTask();
        }
    }
}
