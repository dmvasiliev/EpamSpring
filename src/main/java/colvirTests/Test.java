package colvirTests;

/**
 * Created by Dmitry on 22.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        int[][] x = new int[2][5];
        int[][] y = new int[2][5];

        System.out.println(x[1][3]);
        System.arraycopy(x, 0, y, 0, x.length);
        x[1][3] = 55;
        System.out.println(y[1][3]);
    }
}
