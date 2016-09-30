package core.concurrency;

/**
 * Created by VasDA on 28.09.2016.
 */
public class SleepMessages {
    public static void main(String args[]) {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pause for 4 seconds
            try {
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                if (!Thread.currentThread().isInterrupted()) {
                    System.out.println("флаг isInterrupted небыл установлен");
                }
                Thread.sleep(4 * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}