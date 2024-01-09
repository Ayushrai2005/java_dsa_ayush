public class diagonal_sum {

    // public static int diagonalsum(int matrix[][]) {//time compexity for this
    // function - O(n^2)

    // int sum = 0 ;

    // for(int i = 0 ; i<matrix.length ; i++){

    // for(int j = 0 ; j<matrix[0].length ; j++){

    // if (i==j){
    // sum +=matrix[i][j];
    // }
    // else if(i+j ==matrix.length-1){
    // sum += matrix[i][j] ;

    // }

    // }
    // }
    // return sum ;

    // }

    public static int diagonal_sum1(int matrix[][]) {// 2nd method for better time C
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // For P.D.

            sum += matrix[i][i];

            // For S.D.
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];

        }
        return sum;

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("SUM IS :: " + diagonal_sum1(matrix));

    }

}
