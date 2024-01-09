public class Counting_sort {

    public static void CountingSort(int arr[]) {
        //get largest 
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            largest = Math.max(largest, arr[i]);

        }
        // Create an auxiliary array of size range+1 to store the count of each element
        int count[] = new int[largest + 1];
        // Traverse the input array and increment the count of each element in the auxiliary array.
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }

        // sorting
        int j = 0;
        for (int i = 0; i <count.length; i++) { //we can replace count.length with largest still it gives correct output
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1 , 4 , 1 , 3 , 2 , 4 , 3 , 7 };

        CountingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
