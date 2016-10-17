package core.concurrency.habrahabr.ibm.countDownLatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by VasDA on 03.10.2016.
 */
class Race {
    private Random rand = new Random();

    public int getDistance() {
        return distance;
    }

    private int distance = rand.nextInt(250);
    private CountDownLatch start;
    private CountDownLatch finish;

    private List<String> horses = new ArrayList<String>();

    public Race(String... names) {
        this.horses.addAll(Arrays.asList(names));
    }

    public void run()
            throws InterruptedException {
        System.out.println("И лощади подходят к воротам...");
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch finish = new CountDownLatch(horses.size());
        final List<String> places = Collections.synchronizedList(new ArrayList<String>());

        for (final String h : horses) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        System.out.println(h + " подошли к воротам...");
                        start.await();

                        int traveled = 0;
                        while (traveled < distance) {
                            // через 0-2 секунды....
                            Thread.sleep(rand.nextInt(3) * 1000);

                            // ... лошадь проходит дистанцию 0-14 пунктов
                            traveled += rand.nextInt(15);
                            System.out.println(h + " расширеный для " + traveled + "!");
                        }
                        finish.countDown();
                        System.out.println(h + " пересек финишную прямую!");
                        places.add(h);
                    } catch (InterruptedException intEx) {
                        System.out.println("отмена гонки!!!");
                        intEx.printStackTrace();
                    }
                }
            }).start();
        }

        System.out.println("И... они окончены!");
        start.countDown();

        finish.await();
        System.out.println("И вот наши победители!");
        System.out.println(places.get(0) + " получает золото...");
        System.out.println(places.get(1) + " получает серебро...");
        System.out.println("и " + places.get(2) + " получает бронзу.");
    }


}

public class CDLApp {

    public static void main(String[] args) throws InterruptedException, java.io.IOException {
        System.out.println("Подготовка...");

        Race r = new Race(
                "Beverly Takes a Bath",
                "RockerHorse",
                "Phineas",
                "Ferb",
                "Tin Cup",
                "I'm Faster Than a Monkey",
                "Glue Factory Reject"
        );

        System.out.println("Это дистанция на " + r.getDistance() + " километров");

        System.out.println("Нажмите Enter для запуска гонки....");
        System.in.read();

        r.run();
    }
}