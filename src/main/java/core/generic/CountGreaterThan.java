package core.generic;

/**
 * Created by VasDA on 23.09.2016.
 */
public class CountGreaterThan {
    /*
        public static <T> int countGreaterThan(T[] anArray, T elem) {
            int count = 0;
            for (T e : anArray)
                if (e > elem)  // compiler error
                    ++count;
            return count;
        }
    */
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
