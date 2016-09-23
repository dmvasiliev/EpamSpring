package core.generic;

/**
 * Created by VasDA on 21.09.2016.
 */
public class WarningDemo {
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox() {
        return new Box();
    }
}