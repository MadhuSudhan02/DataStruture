import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        PriorityQueue<Integer> pqrev = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12) ;
        pq.offer(89);
        pq.offer(78);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        pqrev.add(5);
        pqrev.add(4);
        pqrev.add(89);
        pqrev.add(9);

        System.out.println(pqrev);
        System.out.println(pqrev.poll());
        System.out.println(pqrev);

    }
}
