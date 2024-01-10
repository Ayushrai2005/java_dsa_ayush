import java.util.LinkedList;

public class test {

    public static void main(String[] args) {

        LinkedList<Integer> LL = new LinkedList<>();

        LL.add(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);

        System.out.println(LL);
        System.out.println(LL.contains(5));

        System.out.println(LL.getLast());

    }
}