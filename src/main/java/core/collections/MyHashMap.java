package core.collections;

import java.util.HashMap;

/**
 * Created by VasDA on 26.09.2016.
 */
public class MyHashMap {

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null, "Null key");
        hm.put(1, "integer key");

        System.out.println(hm);
    }
}
