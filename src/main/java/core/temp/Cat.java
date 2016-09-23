package core.temp;

import java.util.TreeMap;

/**
 * Created by VasDA on 22.09.2016.
 */
public class Cat implements Comparable<Cat> {

    String name;

    @Override
    public int compareTo(Cat o) {
        return (this.name).compareTo(o.name);
    }


    public static void main(String[] args) {
        TreeMap<Cat, String> ts = new TreeMap<>();

        Cat cat = new Cat();
        cat.name = "Barsik";
        ts.put(cat, "barsik");
        String catNameFirst = ts.get(cat);
        System.out.println(catNameFirst);

        cat.name = "Murka";
        catNameFirst = ts.get(cat);
        System.out.println(catNameFirst);


    }
}
