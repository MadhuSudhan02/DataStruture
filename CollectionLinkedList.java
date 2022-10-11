import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>() ;

        list.addFirst(57) ;
        list.addFirst(67);
        list.addLast(90);
        System.out.println(list);
    }
}
