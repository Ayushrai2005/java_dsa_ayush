import java.util.ArrayList ;
public class arrList{


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10) ;
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list);
        //get Function 
        int second = list.get(0) ;
        System.out.println(second);

        //remove Function
        list.remove(2);
        System.out.println("List after deletion" + list);

        //set element at index
        list.set(2 , 133 );
        System.out.println("list after seting " + list);

        //contains
        System.out.println(list.contains(111));
        System.out.println(list.contains(10));

        //size
        System.out.println(list.size()) ;



        //iterates over arrayList
        for (int i : list) {
            System.out.print(i + " ");
        }









        






        


    }
}