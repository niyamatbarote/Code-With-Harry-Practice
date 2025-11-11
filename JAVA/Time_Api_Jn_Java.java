import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_Api_Jn_Java {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalTime t = LocalTime.now();
        System.out.println(t);
    }
}
