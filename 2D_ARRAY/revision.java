import java.util.Scanner ;
public class revision {

    public static void main(String[] args) {
        
        int matrix[][]= new int[3][3];
        int n = 3 ; 
        int m = 3 ;

        Scanner scnr = new Scanner(System.in);
        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                matrix[i][j] = scnr.nextInt();
            }
        }

        //output
        System.out.println("Output is : ");
        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print (matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
