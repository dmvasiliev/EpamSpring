package core.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by VasDA on 13.10.2016.
 */
public class MyLinkedList {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("0");
        linkedList.add("2");
        linkedList.add(1, "1");


        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Iterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
