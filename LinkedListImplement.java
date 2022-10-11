
public class LinkedListImplement {
    Node head ;
    class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = next;
        }
    }
    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data) ;
        if(head ==null){
            head = newNode ;
            return ;
        }
        newNode.next=head ;
        head = newNode ;
    }
    //add last
    public void addLast(int data) {
        Node newNode = new Node(data) ;
        if(head ==null){
            head = newNode ;
            return ;
        }
        Node currentNode = head ;
        while(currentNode.next!=null) {
            currentNode=currentNode.next ;
        }
        currentNode.next = newNode ;
    }
    // to print
    public void printList(){
        if(head==null){
            System.out.println("the list is empty");
            return ;
        }
        Node currentNode =head ;
        while(currentNode!=null){
            System.out.print(currentNode.data + "->");
            currentNode =currentNode.next;
        }
        System.out.println("null");
    }
    //delete
    //delete First
    public void deleteFirst(){
        if(head==null) {
            System.out.println("the list is empty");
            return ;
        }
        head = head.next ;
    }
    // delete last
    public void deleteLast() {

    }

    public static void main(String[] args) {
        LinkedListImplement list = new LinkedListImplement() ;

        list.addFirst(57);
        list.printList();

        list.addLast(30);
        list.printList();

        list.addLast(70);
        list.printList();

//        list.deleteFirst();
//        list.printList();

    }
}
