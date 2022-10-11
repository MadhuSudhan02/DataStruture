import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        //push method
        animal.push("Lion") ;
        animal.push("cat");
        animal.push("Dog");
        animal.push("Pig");
        System.out.println(animal);
//peek method
        System.out.println(animal.peek());
        System.out.println(animal);
        //pop method
        System.out.println(animal.pop());
        System.out.println(animal);

    }
}
