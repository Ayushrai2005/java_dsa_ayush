import java.util.PriorityQueue;

public class PQobjects {

    static class Student implements Comparable<Student>{

        String name ; 
        int rank ;

        public Student(String name , int rank){
            this.name = name ;
            this.rank = rank ;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank ;
        }
    }
    



    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("ayush" , 1 )); // 0(logn)
        pq.add(new Student("Vaibhav", 78));
        pq.add(new Student("IShan", 42));
        pq.add(new Student("Vaibhav", 34));
        while (!pq.isEmpty()) {
           System.out.println( pq.peek().name + "-> " + pq.peek().rank +  " ") ;
           pq.remove() ;
        }
        System.out.println();
    }
}