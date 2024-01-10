import java.util.LinkedList;

public class rem_cycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // size
    public static int size;

    public void addFirst(int data) {
        // step create new node
        Node newNode = new Node(data);
        size++;// new node created add size ++

        if (head == null) {
            head = tail = newNode;
            return;

        }

        // step newnode next = head
        newNode.next = head;// link

        // step3 head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Find the last node in the cycle
        Node lastInCycle = slow;
        while (fast.next != slow) {
            fast = fast.next;
        }

        // remove cycle-> last.next =null

        prev.next = null;

    }
      // detect loop/cycle
      public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {

        rem_cycle ll = new rem_cycle();

        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
       
        System.out.println(isCycle());

        removeCycle();

        System.out.println(isCycle());

        ll.printLL();

    }
}
