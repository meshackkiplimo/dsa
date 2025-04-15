import java.util.List;

public class Singly{


    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
        
        
    }
    public void printList(){

        ListNode current = head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
            
        }
        System.out.println("null");

    }
    public int length(){

        if (head == null) {
            return 0;
            
        }
        int count=0;
        ListNode current = head;
        while (current!=null) {
          count++;
          current=current.next;
          


        }
        return count;
    }
    public int insertAtFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;

        head=newNode;
        return head.data;

    }
   
    public static void main(String[] args) {
        Singly sll = new Singly();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        // print
         
        sll.printList();
       System.out.println("the length of the list is" + " " + sll.length());
       sll.insertAtFirst(100);
              sll.printList();

    }
}