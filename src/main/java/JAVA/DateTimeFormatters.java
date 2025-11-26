import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeFormatters {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-mm-yy");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("**||dd:mm:yyyy||**asd");

        System.out.println(dt);
        String myDate = dt.format(df);
        String myDate1 = dt.format(df1);
        String myDate2 = dt.format(df2);
        // up
        System.out.println(myDate);
        System.out.println(myDate1);
        System.out.println(myDate2);

    }
}
