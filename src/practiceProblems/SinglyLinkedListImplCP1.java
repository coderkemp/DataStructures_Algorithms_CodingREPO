package practiceProblems;

public class SinglyLinkedListImplCP1 {

   Node head;

   class Node
   {
	  int data;
	  Node next;
	  Node(int x)
	  {
        data = x;
        next = null;
	  }
   }

   // front of the linked list
   public void push(int new_data) {
      Node frontNode = new Node(new_data);
      frontNode.next = head;
      head = frontNode;
   }
   
   //end of the linked list
   public void append(int new_data) {
	   Node endNode = new Node(new_data);
	   if(head==null) {
		   head=endNode;
		   return;
	   }
	   endNode.next = null;
	   Node last = head;
	   while(last.next != null) {
		   last = last.next;
	   }
	   last.next = endNode;      	      
   }
   
   public void printTheList() {
	   Node printMe=head;
	   while(printMe!=null) {
		   System.out.println(printMe.data);
		   printMe = printMe.next;
	   }
   }
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
         SinglyLinkedListImplCP1 sll = new SinglyLinkedListImplCP1();
         sll.push(1);
         sll.append(2);
         sll.append(3);
         sll.append(4);
         sll.append(5);
         sll.printTheList();
         
	}

}
