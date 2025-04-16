package doublelinkedlist;




    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data= data;
        }
    }
    class  DoubleList{
        Node head;
        Node tail;
        // add a node to the end of the list
        void add(String data ){
            Node  newNode = new Node(data);
            if(head == null ){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
           
        }
        //method to remove specific node
        boolean remove(String data){
            Node current = head;
            while(current !=null){
                if(current != null ){
                    if(current.data.equals(data)){
                        if(current.prev != null){
                            current.prev.next = current.next;
                        } else{
                            head = current.next;
                        }
                        if (current.next != null){
                            current.next.prev = current.prev;
                        }else{
                            tail = current.prev;
                        }
                        return true;
                    }
                    current = current.next; 
                }
                
            }
            return false;

        }
        // method to find a node
        boolean contains(String data){
            Node current = head;
            while(current !=null){
                if (current.data.equals(data)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
        // method to print  the list from head to tail
        void printForward(){
            Node current = head;
            while(current != null){
                System.out.println("this is it " + current.data);
                current = current.next;

            }
           System.out.println("this is what is got after updating the opratiob----------");
        }

         //metod to update nodes data
         boolean update (String oldData, String newData){
            Node current = head;
            while (current != null){
                if(current.data.equals(oldData)){
                    current.data = newData;
                    return true;
                }
                current = current.next;
            }
            return false;
         }


    }
    public class DoubleLinkedListOperations {

        public static void main(String[] args) {
          DoubleList list = new DoubleList();
          list.add("Node1");
          list.add("Node2");
          list.add("Node3");
          System.out.println("thios is the list after adding the nodes " );
            list.printForward();
            // remove operation
            list.remove("Node2");
            System.out.println("this is the list after removing the node " );
            list.printForward();
            //FIND OPERATION
            boolean foundNode1= list.contains("Node1");
            boolean foundNode3= list.contains("Node3");
            System.out.println("this is the list after finding the node " + foundNode1);
            System.out.println("this is the list after finding the node " + foundNode3);


            //forward iterate operation
            System.out.println("iterate operation---------");
            list.printForward();

            //update operation
            list.update("Node1", "updatedNode1");
            System.out.println("this is the list after updating the node " );
            list.printForward();
        // final state of the list
        System.out.println("this is the final state of the list " );
            list.printForward();
            // print the list from tail to head
        }


    }

    

    
    

