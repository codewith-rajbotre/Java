class Node{
    int data;
    Node next;
    Node(){};
    Node(int data){
        this.data = data;
        this.next=null;
    }

}



public class LinkedList{
    static Node head;
        public static void printNode(Node head){
               Node n = head;
               while(n.next!=null){
                  System.out.println(n.data);
                  n = n.next;
               }
               System.out.println(n.data);
        }


      public static void insert(int data){
          
           Node node = new Node();
           node.data = data;
           node.next=null;

           if(head==null){
              head = node;
           }else{
           Node n = head;
           while(n.next !=null){
                n = n.next;
           }
           n.next = node;
           }
           


      }

    public static void main(String[] args) {
        System.out.println("Linked list example");
        // Node head = new Node();
        // Node first = new Node();
        // Node second = new Node();

        // head.data =3;
        // head.next = first;
        // first.data = 33;
        // first.next = second;
        // second.data = 23;

        insert(2);
        insert(3);
        insert(4);
        printNode(head);
    }
    
}

