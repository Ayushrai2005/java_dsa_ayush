import java.util.*;

public class MD_array {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);

        }

        Mainlist.add(list);
        Mainlist.add(list2);
        Mainlist.add(list3);

        for (int i = 0; i < Mainlist.size(); i++) {

            ArrayList<Integer> currList = Mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + "");
            }
            System.out.println();

        }

        System.out.println(Mainlist);

    }
}
