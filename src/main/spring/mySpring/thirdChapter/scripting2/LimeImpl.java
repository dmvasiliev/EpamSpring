package mySpring.thirdChapter.scripting2;

import mySpring.thirdChapter.scripting.Lime;

/**
 * Created by Dmitry on 07.04.2017.
 */
public class LimeImpl implements Lime {
    public LimeImpl() {
    }

    public void drink() {
        System.out.println("Called the doctor woke him up!");
    }
}