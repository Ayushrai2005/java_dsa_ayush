public class problem7 { // waf to find the first occurence of an element in an array

    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 5, 4, 5, 6, 4, 5, 4, 8, 5 };

        System.out.println(firstOccur(arr, 5, 0));
    }

}
