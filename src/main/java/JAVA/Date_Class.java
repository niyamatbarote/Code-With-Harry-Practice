import java.util.*;

public class Date_Class {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE / 1000 / 3600 / 24 / 365);
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        System.out.println("i.e. We can store/calculate time till upcoming 292471208 YEARS ");

        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);

        // Methods :-
        System.out.println(d.getTime());
        

    }
}
