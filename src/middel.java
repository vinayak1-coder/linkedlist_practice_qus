public class middel {
    Node head;
    class Node{
        int element;
        Node next;
        public Node(int e){
            element = e;
            next = null;
        }

    }
    //public middel(){
      //  head = null;
    //}
    void mid(){
        Node a=head;
        Node b=head;
        while (a != null && a.next!= null)
        {
            a = a.next.next;
            b = b.next;
        }
        System.out.println("The middle element is [" + b.element + "] \n");
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.element+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        middel llist = new middel();
        for (int i=5; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            llist.mid();
        }
    }
}
