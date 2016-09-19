package evBorisov.epamJava.Twow;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by VasDA on 19.09.2016.
 */
public class GarbColl {

    //-verbose:gc -Xmx64m -Xms64m
    public static void main(String[] args) {
        ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            stringBuilders.add(new StringBuilder("sdfsdsd"));
        }
        System.out.println(stringBuilders.get(new Random().nextInt(stringBuilders.size())));
        System.gc();
    }
}
