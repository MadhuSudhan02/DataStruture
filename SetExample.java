import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;
        set.add(10) ;
        set.add(3);
        set.add(4) ;
        set.add(5) ;
        set.add(6) ;
        set.add(7) ;
        set.add(50) ;
        System.out.println(set);

//        System.out.println(set.remove(3));
//        System.out.println(set);
//
//        System.out.println(set.contains(5));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
    }
}
