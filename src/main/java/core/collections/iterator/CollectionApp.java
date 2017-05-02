package core.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Dmitry on 02.05.2017.
 */
public class CollectionApp {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {

            System.out.println(iter.next());
        }
    }
}


