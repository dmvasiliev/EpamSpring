package core.collections;

import java.util.HashMap;

/**
 * Created by VasDA on 26.09.2016.
 */
public class HashMapGetOrDefaultExample {

    public static void main(String[] args) throws InterruptedException {

        int idNum = 9756;
        HashMap<Integer, String> map = init();

        //ToDo work only Java 8
//        System.out.println("Student with id number " + idNum + " is " + map.getOrDefault(idNum, "John Doe"));

    }

    private static HashMap<Integer, String> init() {
        // declare the hashmap
        HashMap<Integer, String> mapStudent = new HashMap<>();
        // put contents to our HashMap
        mapStudent.put(73654, "Shyra Travis");
        mapStudent.put(98712, "Sharon Wallace");
        return mapStudent;
    }

}