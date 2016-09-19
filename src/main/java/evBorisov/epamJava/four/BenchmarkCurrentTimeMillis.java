package evBorisov.epamJava.four;

/**
 * Created by Dmitry on 20.09.2016.
 */
public class BenchmarkCurrentTimeMillis {

    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread.sleep(1);
        long after = System.currentTimeMillis();

        System.out.println((after - before));
    }

}
