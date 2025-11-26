package Advanced_JAVA;

import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Adding in the ArrayList:-
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(11);
        list1.add(24);
        list1.add(0, 212);

        list2.add(212);
        list2.add(434);
        list2.add(214);
        list2.add(431);

        // Methods
        list1.addAll(list2);    // Add All Elements of List2
        list1.remove(list1.size() - 1);
        list1.set(1, 45);
        list1.removeAll(list2); // Removes All Elements of List2
        System.out.println(list1.subList(0, 5));    // Prints the Sublists
        list1.retainAll(list2); // Removes all elements of list2
        list1.equals(212); // Dont know





        // Output of The ArrayList:-
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            System.out.print(", ");
        }
        // Other Method
        System.out.println("\n" + list1);

        // Methods in ArrayList:-
        System.out.println(list1.get(0));
        System.out.println(list1.size());
        System.out.println(list1.contains(212));
        System.out.println(list1.indexOf(212));
        System.out.println(list1.lastIndexOf(212));
        // list1.clear(); // removes/clears all the elements from the list
        
    }
}
