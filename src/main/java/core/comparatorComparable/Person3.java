package core.comparatorComparable;

/**
 * Created by Dmitry on 02.05.2017.
 */

//Начиная с JDK 8 в механизм работы компараторов были внесены некоторые дополнения. В частности, теперь мы можем
// применять сразу несколько компараторов по принципу приоритета. Например, изменим класс Person следующим образом:
class Person3 {

    private String name;
    private int age;

    public Person3(String n, int a) {

        name = n;
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}
