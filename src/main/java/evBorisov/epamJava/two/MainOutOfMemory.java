package evBorisov.epamJava.two;

import java.util.ArrayList;

/**
 * Created by Dmitry on 18.09.2016.
 */
public class MainOutOfMemory {
    public static void main(String[] args) {
        ArrayList<StringBuilder> stringBuilder = new ArrayList<StringBuilder>();
        int j = 0;
        while (true) {
            j++;

            Integer num = 100;

            for (int i = 0; i < num * 10000; i++) {
                stringBuilder.add(new StringBuilder("abc"));
                System.out.println(i);
            }
            System.out.println(num * 1000 + " object were added");
        }

    }
}
