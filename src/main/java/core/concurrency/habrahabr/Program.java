package core.concurrency.habrahabr;

/**
 * Created by VasDA on 30.09.2016.
 */
public class Program            //Класс с методом main()
{
    static SomeThing mThing;    //mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args) throws InterruptedException {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);    //Создание потока "myThready"
        myThready.start();                //Запуск потока
        myThready.join(10 * 1000);
        System.out.println("Главный поток завершён...");

    }
}
