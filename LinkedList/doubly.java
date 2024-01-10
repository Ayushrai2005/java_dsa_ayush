public class doubly {

    public class Node {
        int data ;
        Node next ;
        Node prev ;

        public Node(int data){
            this.data = data;
            this.next = null ;
            this.prev = null ;
        }
    }
    

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {

        doubly dll = new doubly();

        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(45);

        dll.print();

    }

}
