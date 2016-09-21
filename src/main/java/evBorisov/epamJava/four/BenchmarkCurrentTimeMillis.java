package evBorisov.epamJava.four;

/**
 * Created by Dmitry on 20.09.2016.
 */
public class BenchmarkCurrentTimeMillis {

    //ToDo -XX:+PrintCompilation
    //ToDo  -XX:CompileCommandFile=.hotspot_compiler
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread.sleep(1);
        long after = System.currentTimeMillis();

        System.out.println((after - before));
    }

}
