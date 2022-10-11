import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String , Integer> trm = new TreeMap<>() ;
        trm.put("one" , 1) ;
        trm.put("Two" , 2) ;
        trm.put("Three" , 3) ;
        trm.put("Four" , 4) ;
        System.out.println(trm);
        trm.remove("Two");
        System.out.println(trm);
    }
}
