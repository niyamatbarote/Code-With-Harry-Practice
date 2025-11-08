import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        // Syntax for Linded List is Much similar as ArrayList
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(5);
        list1.add(8);
        list1.add(9);
        list1.add(2);
        list2.add(54);
        list2.add(84);
        list2.add(97);
        list2.add(21);

        System.out.println(list1);
        list1.addAll(list2);
        System.out.println(list1);
        list1.addFirst(69);
        list1.addLast(96);
        System.out.println(list1);
        System.out.println(list1.peek()); // returns peak element
        System.out.println(list1.equals(list2)); // comparison
        System.out.println(list1.pop());    /// returns popped element
        System.out.println(list1);  
    }
}
