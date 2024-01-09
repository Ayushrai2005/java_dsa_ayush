public class prefix_subarray {

    public static void max_subarraySums(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maximum of subarray " + maxSum);

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
// timecomplexity for this is O(n^2)
