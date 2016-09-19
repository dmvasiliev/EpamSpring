package evBorisov.epamJava.four;

/**
 * Created by Dmitry on 20.09.2016.
 */

public class Benchmark {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int rep = 10000000;
        double sqrt = 0;
        for (int i = 0; i < rep; i++) {
            sqrt = Math.sqrt(i);
        }
        long after = System.currentTimeMillis();
        System.out.println(sqrt);
        System.out.println(after - before);
    }
}
