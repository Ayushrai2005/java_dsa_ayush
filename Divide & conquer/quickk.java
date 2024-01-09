public class quickk {


    public static void printarr(int arr[]) {

        // to print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void quickSort(int arr[] , int si , int ei) {

        if(si>=ei){
            return ;
        }

        //last element as pivot 
        int pinx = partition(arr , si , ei );
        quickSort(arr, si, pinx-1);//left part
        quickSort(arr, pinx+1, ei);
        
    }

    public static int partition(int arr[] , int si , int ei) {

        int pivot = arr[ei] ;
        int i = si- 1 ; //to take place for elements smaller than pivot

        for(int j  = si ; j<ei ; j++){
            if(arr[j] <= pivot){
                i++ ;

                //swap
                int temp = arr[j] ;
                arr[j] = arr[i];
                arr[i] = temp ;


            }
        }
        i++ ;
        int temp = pivot ;
        arr[ei] = arr[i];
        arr[i] = temp ;
        return i ;
    }


    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length-1);

        printarr(arr);
    }
    
}
