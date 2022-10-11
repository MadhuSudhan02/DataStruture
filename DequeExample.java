import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>() ;
        adq.offer(40);
        adq.offer(57);
        adq.offer(78);
        adq.addFirst(7);
        adq.addLast(1998);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        //System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);

    }
}
