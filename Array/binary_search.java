public class binary_search {
    public static int binaryy_search(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) {

                return mid;
            }

            if (numbers[mid] < key) { // right condition
                start = mid + 1;

            } else {
                end = mid - 1;

                
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int key = 101;

        int numbers[] = { 2, 10, 25, 35, 47, 98, 101, 801 };
        
        System.out.println("Index of key is :" + binaryy_search(numbers, key));

    }

}
