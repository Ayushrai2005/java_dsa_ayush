import java.util.Comparator;
import java.util.PriorityQueue;

public class buildPQ {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // 0(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {

           System.out.println( pq.peek() + " ") ;
           pq.remove() ;
        }
        System.out.println();
    }
}