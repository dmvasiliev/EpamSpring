package evBorisov.epamJava.four;

/**
 * Created by Dmitry on 20.09.2016.
 */

public class Benchmark {


    //ToDo http://www.reins.altervista.org/java/A_Collection_of_JVM_Options_MP.html
    //ToDo  -XX:CompileCommandFile=.hotspot_compiler
    public static void main(String[] args) {
//        double sqrt1 = Math.sqrt(4);

        long before = System.nanoTime();
        int rep = 10000000;
        double sqrt = 0;
        for (int i = 0; i < rep; i++) {
            sqrt = Math.sqrt(i);
        }
        long after = System.nanoTime();
        System.out.println(sqrt);
//        System.out.println(sqrt1);
        System.out.println((after - before) / rep);
    }
}
