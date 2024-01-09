import java.util.*;
public class max_list {
    

    public static void main(String[] args) {
        
         ArrayList<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(11);
        list.add(12);
        list.add(18);
        list.add(64);
        list.add(14);

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<list.size() ; i++){
            //if(max < list.get(i)){
             //   max = list.get(i) ;
            //}

            max = Math.max(max, list.get(i));


        }

        System.out.println("Max is " + max);
    }
}
