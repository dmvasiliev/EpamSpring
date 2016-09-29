package core.collections.arraylist;

import java.util.ArrayList;

/**
 * Created by Dmitry on 30.09.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        System.out.println("before");
        Thread.currentThread().sleep(10 * 1000);
        list.add("third");
        System.out.println("after");
    }
}
