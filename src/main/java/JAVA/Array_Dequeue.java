import java.util.ArrayDeque;

public class Array_Dequeue {
    public static void main(String[] args) {

        // Syntax
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(34);
        ad1.add(43);
        ad1.add(54);
        ad2.add(75);
        ad2.add(76);
        ad2.add(56);
        ad1.addFirst(43);
        ad1.addLast(87); // NOte

        System.out.println(ad1.size());
        ad1.addAll(ad2);
        System.out.println(ad1);
        System.out.println(ad1.size());
        ad1.offerFirst(99);// add to first
        System.out.println(ad1);
        ad1.offerLast(76); // add to last
        System.out.println(ad1.peekFirst());    // note
        System.out.println(ad1.peek()); // peak element
        System.out.println(ad1.peekLast()); // note* 
        

    }
}
