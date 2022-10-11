import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>() ;
        list.add(7);
        list.addFirst(3);
        list.addLast(90);
        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);
//        list.remove(1) ;
//        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
}
