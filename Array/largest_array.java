
public class largest_array {
    public static int getLargestint(int numbers[]) {
        int largest = Integer.MIN_VALUE; // Integer.MIN_VALUE is used for -infinity
        int smallest = Integer.MAX_VALUE; // Integer.MAX_VALUE is used for +infinity

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {

                largest = numbers[i];

            }

            if (smallest > numbers[i]) {

                smallest = numbers[i];
            }

        }
        System.out.println("Smallest  number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 84, 244, 31, 5, 7, 15 };
        System.out.println("Largest number is " + getLargestint(numbers));

    }

}
