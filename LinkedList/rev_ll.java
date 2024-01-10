public class rev_ll {

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

    // add at middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i becomes index-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // remove first
    public int removeFirst() {

        if (size == 0) {
            return 0;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL i wpty ");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev: i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative search ;
    public int search(int key) {
        Node temp = head;
        int i = 0;
        ;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // ley not found
    }

    // helper function for recursive search
    public int helper(Node head, int key) {
        if (head == null) { // base case
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;

    }

    // Recursive search ->
    public int recSearch(int key) {
        return helper(head, key);

    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;// remove first
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n; // index to find
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

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

        rev_ll ll = new rev_ll();
        // ll.addFirst(2);
        // ll.addFirst(1);

        // ll.addLast(3);
        // ll.addLast(4);

        // ll.add(4, 5);

        // System.out.println("Size of LL is : " + size);

        // // System.out.println(ll.recSearch(3));
        // ll.reverse();
        // ll.printLL();

        // ll.deleteNthfromEnd(3);
        // ll.printLL();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());


        ll.printLL();

    }
}