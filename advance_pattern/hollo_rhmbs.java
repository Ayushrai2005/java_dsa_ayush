package advance_pattern;

public class hollo_rhmbs{


    public static void ho_rhmbs (int n){
    for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");

            }

            //hollow rectangle

            for(int j = 1 ; j<=n ; j++ ){

                if(i==1 || i ==n ||  j ==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        ho_rhmbs(8);
    }

    }
