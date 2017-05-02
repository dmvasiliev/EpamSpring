package core.comparatorComparable;

/**
 * Created by Dmitry on 02.03.2017.
 */
public class DoubleHolder implements Comparable<DoubleHolder> {
    double d;

    public DoubleHolder(double d) {
        this.d = d;
    }


    @Override
    public int compareTo(DoubleHolder o) {
        return d > o.d ? 1 : d == o.d ? 0 : -1;
    }

    @Override
    public String toString() {
        return String.valueOf(d);
    }
}