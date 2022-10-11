public class LinkedListAssignment {
    Node head ;
    class Node {
        int data ;
        LinkedListImplement.Node next ;
        Node(int data){
            this.data = data ;
            this.next = next;
        }
    }

    //adding
    public void addFirst(int data) {
        Node newNode = new Node (data) ;
        if(head==null){
            head = newNode ;
            return ;
        }
       // newNode.next= head ;

    }


    public static void main(String[] args) {

    }
}
