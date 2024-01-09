import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        // for inbuilt sorting Import java.util.Array
        /*
         * To sort all elements we use
         * Array.sort( Array name) for here // Array.sort(arr) //
         */
        // Arrays.sort(arr);

        /*
         * To Sort the elementes from and to range we use
         * Array.sort(Array name , From value , To value)
         */
        // Arrays.sort(arr, 0, 3);

        // To get Descending order
        /*
         * We have to import java.util.Collections; to get reverse order
         * 
         * 
         */

        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, 0, 4, Collections.reverseOrder()); // it only works with Object variable ie. Integer type
        // we cant use reverse order on normal int
        // we have to use Integer variable not int

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }

    }
}
