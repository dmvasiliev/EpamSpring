package core.classes;

/**
 * Created by VasDA on 27.09.2016.
 */
public class Demo {

    /*ToDo
    * Код наглядно демонстрирует: несмотря на то, что объект имеет тип Car, вызван статический метод из класса Vehicle, т.к. произошло
    * обращение к методу во время компиляции. И заметьте, ошибки во время компиляции не возникло!
    * */
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.kmToMiles(10);
    }
}
