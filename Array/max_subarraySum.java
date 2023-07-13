public class max_subarraySum {

    public static void max_subarraySums(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) { // print

                    // subarrays
                    currSum += numbers[k];
                }
                System.out.println(currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maximum " + maxSum);

        System.out.println("Total subarrays : " + numbers.length * (numbers.length + 1) / 2); // it also gives total
                                                                                              // numbers of pairs
                                                                                              // (Arithmetic operations
                                                                                              // usages to get total
                                                                                              // pairs)

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        max_subarraySums(numbers);

    }
}
//timecomplexity for this is O(n^3)