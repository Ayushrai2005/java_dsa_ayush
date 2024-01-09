import java.util.*;

public class pair_sum {

    public static boolean pairsum1(ArrayList<Integer> List, int target) {

        for (int i = 0; i < List.size(); i++) {

            for (int j = 0; j < List.size(); j++) {

                if (List.get(i) + List.get(j) == target) {

                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target = 5;

        System.out.println(pairsum1(List, target));

    }

}
