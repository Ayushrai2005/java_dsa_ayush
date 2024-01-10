import java.util.*;

public class first {

    public static void main(String[] args) {

        int start[] = { 3, 0, 8, 5, 5, 1 };
        int end[] = { 4, 6, 9, 7, 9, 2 };

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

        }

        // lambda function -? shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        for (int i = 0; i < activities.length; i++) {
            for (int j = 0; j < activities[i].length; j++) {
                System.out.print(activities[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1stActivity          
        maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1]>= lastEnd) {
                // select activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];

            }
        }
 
        System.out.println("maxim um activity =  " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");

        }
    }
}