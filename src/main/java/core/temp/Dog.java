package core.temp;

import java.util.HashMap;

/**
 * Created by VasDA on 22.09.2016.
 */
public class Dog {
    String name;

//    @Override
//    public int hashCode() {
//        return name.length();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this.name.co)
//
//        return this.name.compareTo()
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public static void main(String[] args) {

        HashMap<Dog, String> hm = new HashMap<>();
        Dog dog = new Dog();
        dog.name = "Sharik";
        hm.put(dog, "123");

        System.out.println(hm.get(dog));
        dog.name = "Pes";
        System.out.println(hm.get(dog));

        Dog dog2 = new Dog();
        dog2.name = "Sharik";
        System.out.println(hm.get(dog2));

    }
}
