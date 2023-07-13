public class prnt_subarrays {

    public static void printSubarrays(int numbers[]) {

        int total = 0; //to get no of total subarrays 

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                for (int k = start; k <= end; k++) {  //print

                    System.out.print(numbers[k] + " "); //subarrays
                    System.out.println();
                }
            total++; //to get no of total subarrays 
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total subarrays = " + total);

        System.out.println("Total subarrays : " + numbers.length*(numbers.length+1)/2 ); //it also gives total numbers of pairs (Arithmetic operations usages to get total pairs)
            


    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);

    }
}