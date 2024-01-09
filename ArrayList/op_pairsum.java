import java.util.ArrayList;

public class op_pairsum {
    public static boolean optiPairsum(int target, ArrayList<Integer> List) {

        int lp = 0;
        int rp = List.size() - 1;

        while (lp != rp) {

            if (List.get(lp) + List.get(rp) == target) {
                return true;
            }

            if (List.get(lp) + List.get(rp) < target) {
                lp++;
            } else if (List.get(lp) + List.get(rp) > target) {
                rp--;

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
        int target = 12;

        System.out.println(optiPairsum(target, List));

    }
}
