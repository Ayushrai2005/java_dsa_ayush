public class problem8 {// last occurence

    public static int lastOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccur(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {

            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 5, 4, 5, 6, 4, 5, 4, 8, 5 };
        System.out.println(lastOccur(arr, 5, 0));




    }
}
