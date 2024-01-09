public class problem2 {
    public static void printinc(int n){ //increasing order
        if(n==1){
            System.out.println(n);
            return ;
        }

        printinc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        printinc(10);
        
    }
    
}



