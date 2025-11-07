package DSA;

public class StringBuild {
    public static void main(String[] args) {
        // String objects are stored in "String Pool" which is Present in "Heap Memory"
        // Strings are immutable, i.e. Once We Create a String, We cannot Modify it.

        // Here, We Created a reference Variable 'name' and assigned it as "Niyamat" and
        // printed it
        // then we again assigned "Barote" to it, then we printed it, what actually
        // happened ..!!
        // I said we cannot modify String then how did I 'changed' it ?
        // ans--> No, I didnt changed it, actaully gave other value to the object.
        // Here, we didn't changed the value of name but assigned other value in 'name'
        // And that 'Niyamat' value will be Managed by "Garbage Collection" system

        // String name = "Niyamat";
        // System.out.println(name);
        // name = "Barote";
        // System.out.println(name);

        // Camparing Strings:
        // String a = "Ajaz";
        // String b = "Ajaz";

        // System.out.println(a == b); // Here, "Ajaz" is assigned to both a & b, the same value is present in the a &
                                    // b, This is because Strings are immutable and we cannot Modify it
        // Lets Understand it with an example :-

        // String k = "Niyamat";
        // String g = "Niyamat Barote";
        // System.out.println(k == g);

        // Here we didnt modified the String 'k' but assigned another value to the 'g'
        // Note* Here (==) is comparator, it is used to check it that variable 'k' & 'g'
        // is idndicating to the same object or not that's why it is false and it is
        // true for 'a' & 'b'

        // here, (%s, %f,) are placeholders
        // float s = 4.1234f;
        // float as = 4.99999999f;
        // System.out.printf("Value of s is: %f", s);
        // System.out.printf("\nPie %.2f", s);
        // System.out.printf("\nRound Fugure %.2f", as);
        // System.out.printf("\nPIE %.3f", Math.PI);
        // System.out.printf("\nHello I'm %s and i'm %s", "Niyamat", "Happy");

        // Other placeholders in JAVA:
        // %c - Character
        // %d - Decimal number (base 10)
        // %e - Exponential floating-point number
        // %f - Floating-point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %s - String
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n - Newline

        // String Oerators:-
        System.out.println("a"+"b");
        System.out.println('a' + 'b');  // It Considers the ASCII Value of 'a' & 'b'
        System.out.println('a' +"b");
        System.out.println('a' + 3);
        System.out.println("a" + 3);
        // Note* when an integer is Concatinated(Added) with a String, It is converted to its wrapper class Integer


    }
}



