import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> newlist = new ArrayList<>() ;
        list.add(57);
        list.add(68);
        list.add(90);
        //to add the element to the given element
        list.add(1,50);
        System.out.println(list);
        newlist.add(230);
        System.out.println(newlist);
//this method will add all the element to new array
        newlist.addAll(list);
        System.out.println(newlist);
        //using the get method
        System.out.println(list.get(1));
        System.out.println(newlist.get(0));
        //using the remove method with index
        System.out.println(list.remove(2));
        System.out.println(list);
        //using the remove method with positon
        System.out.println(list.remove(Integer.valueOf(53)));
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(57)));
        System.out.println(list);
//clear
//        list.clear();
//        System.out.println(list);
        list.set(0,1000);
        System.out.println(list);
//checking the ele=ment is presentr oe not
        System.out.println(list.contains(100));

    }
}
