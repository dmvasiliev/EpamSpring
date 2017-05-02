package core.collections.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Dmitry on 02.05.2017.
 */
public class CollectionApp2 {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");

        ListIterator<String> listIter = states.listIterator();

        while (listIter.hasNext()) {

            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while (listIter.hasPrevious()) {

            System.out.println(listIter.previous());
        }
    }
}
