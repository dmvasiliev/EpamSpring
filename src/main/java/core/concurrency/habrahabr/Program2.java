package core.concurrency.habrahabr;

/**
 * Created by VasDA on 30.09.2016.
 */
public class Program2 {
    static AffableThread mSecondThread;

    public static void main(String[] args) {
        mSecondThread = new AffableThread();    //Создание потока
        mSecondThread.start();                    //Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
