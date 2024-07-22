class Node{
    int data ;
Node next;
// Member Data 

public Node(int data){
     this.data = data;
      this.next = null;
}

public void printData(Node head){
      if(head == null){
     System.out.println(("List is Empty");
      }
      else{
        Node temp = head ;
       while(temp != null){
         System.out.println("==>"+temp.data);
          temp = temp.next;
       }
      }
}
public static void main(String args[]){
      Node  first  = new Node(10);
  Node  second   = new Node(23);
  Node  third  = new Node(134);
  Node  four = new Node(34);
Node head = first ;
head.next = second;
head.next.next = third;
head.next.next.next = four;
System.out.println("println Data of singly linked list : ");
head.printData(head);
}
}
