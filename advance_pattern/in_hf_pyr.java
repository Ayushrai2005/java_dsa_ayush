package advance_pattern;

public class in_hf_pyr {

    public static void in_half_pyr( int n ){
        for(int i = 1 ; i<= n ; i ++){

            for(int j=1 ; j<=n-i+1 ; j++ ){
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        in_half_pyr(10);
    }
    
}
