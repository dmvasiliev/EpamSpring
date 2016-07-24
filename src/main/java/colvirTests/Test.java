package colvirTests;

/**
 * Created by Dmitry on 22.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        int[][] x = {{11,12,13,14,15},{21,22,23,24,25}};
        int[][] y = {{111,112,113,114,115},{221,222,223,224,225}};

        System.out.println(x[1][3]);
        System.arraycopy(x, 0, y, 0, 1);
        x[0][3] = 55;
        for (int[] ints : y) {
            for (int anInt : ints) {
                System.out.print(anInt +  ", ");
            }
            System.out.println();
        }
        System.out.println(y[0][3]);
    }
}
