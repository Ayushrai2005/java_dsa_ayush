public class prnt_pairs {

    public static void printPairs(int numbers[]) {

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            int curr = numbers[i]; // 2 , 4 , 6 , 8 , 10

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(" ( " + curr + ", " + numbers[j] + " ) ");
                total++;

            }

            System.out.println();
        }

        System.out.println("total pairs  = " + total);

        System.out.println(numbers.length*(numbers.length-1) / 2 );    //it also gives total numbers of pairs (Arithmetic operations usages to get total pairs)

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 8, 6, 10 };

        printPairs(numbers);

    }

}