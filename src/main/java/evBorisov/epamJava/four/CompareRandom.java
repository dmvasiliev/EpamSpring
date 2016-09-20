package evBorisov.epamJava.four;

import java.lang.management.CompilationMXBean;
import java.lang.management.ManagementFactory;

/**
 * Created by VasDA on 20.09.2016.
 */
public class CompareRandom {
    public static void main(String[] args) {
        CompilationMXBean mxBean = ManagementFactory.getCompilationMXBean();
        long totalCompilationTime = mxBean.getTotalCompilationTime();

        int rep = 100000;
        double random = 0;
        //ToDo разогрев
        for (int i = 0; i < rep; i++) {
//            if (totalCompilationTime != mxBean.getTotalCompilationTime()) {
//                System.out.println("compiler made something" + i);
//                totalCompilationTime = mxBean.getTotalCompilationTime();
//            }
            random = Math.random();
        }

        rep = 1000000;
        //ToDo реальный замер(разогретого кода)
        long before = System.nanoTime();
        for (int i = 0; i < rep; i++) {
            random = Math.random();
        }
        long after = System.nanoTime();
        System.out.println(random);
        System.out.println((after - before) / rep);
    }
}
