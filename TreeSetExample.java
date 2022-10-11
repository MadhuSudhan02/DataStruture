import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> tr = new LinkedHashSet<>() ;
        tr.add(56) ;
        tr.add(45) ;
        tr.add(4) ;
        tr.add(5) ;
        tr.add(1) ;
        System.out.println(tr);
    }
}
