package evBorisov.epamJava.four.caliper;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;

import java.util.Random;

/**
 * Created by Dmitry on 24.09.2016.
 */
public class RandomBenchmark extends SimpleBenchmark {
    private Random random;

    public void timeMathRandom(int reps) {
        for (int i = 0; i < reps; i++) {
            Math.random();
        }
    }

    public static void main(String[] args) {
        Runner.main(RandomBenchmark.class, new String[]{"--trials", "3"});
    }
}
