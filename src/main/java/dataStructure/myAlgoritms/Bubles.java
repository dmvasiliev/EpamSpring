package dataStructure.myAlgoritms;

/**
 * Created by Dmitry on 28.10.2016.
 */
public class Bubles {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 5, 8, 34, 654, 676};
        System.out.println("array length= " + array.length);

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + ", ");
        }
        System.out.println();
        System.out.println("array length= " + array.length);
    }
}
