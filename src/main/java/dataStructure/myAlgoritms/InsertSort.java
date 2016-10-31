package dataStructure.myAlgoritms;

/**
 * Created by Dmitry on 29.10.2016.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 5, 8, 34, 654, 676, 555, 0, 2};

        System.out.println("array length= " + array.length);

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] < array[min]) && array[j] < array[i]) {
                    min = j;
                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;
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
