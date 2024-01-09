public class mergee {

    public static void printarr(int arr[]) {

        // to print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {

            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei) / 2
        mergeSort(arr, si, mid);// left part sorting recursively
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // left (0,3) , right(4,6) -> 6-0 +1 = 7 size
        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left half
        int j = mid + 1; // for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++; //pointer for temp arr inreasing to next index
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8  , -2};
        mergeSort(arr, 0, arr.length - 1);

        printarr(arr);

    }
}