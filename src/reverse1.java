public class reverse1 {
    static Node head;

    static class Node{
        int element;
        Node next;
        //Node prev;
        public Node(int e,Node n,Node p){
            element = e;
            next = n;
            //prev = p;
        }

    }
    //private Node head;
    //private Node tail;
    //private int size;
    public reverse1(){
        head = null;
    }
    public Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        reverse1 r = new reverse1();
        r.head=new Node(35,null,null);
        r.head.next = new Node(15,null,null);
        r.head.next.next = new Node(4,null,null);
        r.head.next.next.next = new Node(20,null,null);

        System.out.println("Given Linked list");
        r.printList(head);
        head = r.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        r.printList(head);
    }

}
