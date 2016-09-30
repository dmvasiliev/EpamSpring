package core.concurrency.habrahabr;

/**
 * Created by VasDA on 30.09.2016.
 */
class AffableThread extends Thread {
    @Override
    public void run()    //Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}