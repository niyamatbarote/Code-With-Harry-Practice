import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {

        HashSet<Integer> myHashset = new HashSet<>();
        HashSet<Integer> myHashset1 = new HashSet<>();
        myHashset.add(5);
        myHashset.add(15);
        myHashset.add(67);
        myHashset.add(10);
        myHashset.add(83);
        System.out.println(myHashset); // The Hashset is presented using Hashing Technique
        System.out.println(myHashset.contains(67));
        System.out.println(myHashset.hashCode()); // Prints Addition (IDK)
        System.out.println();
        myHashset1.add(59);
        myHashset1.add(35);
        myHashset1.add(57);
        myHashset1.add(50);
        myHashset1.add(23);
        System.out.println(myHashset1.hashCode());
        System.out.println(myHashset1);
        myHashset.addAll(myHashset1);
        System.out.println(myHashset);

    }
}
