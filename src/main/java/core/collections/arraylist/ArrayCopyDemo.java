package core.collections.arraylist;

/**
 * Created by Dmitry on 28.09.2016.
 */
public class ArrayCopyDemo {

    public static void main(String[] args) {

        int arr1[] = {0, 1, 2, 3, 4, 5};
        int arr2[] = {5, 10, 20, 30, 40, 50};

        int[] arr3 = new int[13];

        // copies an array from the specified source array
//        System.arraycopy(arr1, 0, arr2, 0, 6);

        System.arraycopy(arr1, 0, arr3, 0, 6);
        System.arraycopy(arr2, 0, arr3, 6 - 1, 6);
        for (int i : arr3) {
            System.out.print(i + ", ");
        }



/*        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
        System.out.println("");
        System.out.println(arr2[5]);*/
    }
}
