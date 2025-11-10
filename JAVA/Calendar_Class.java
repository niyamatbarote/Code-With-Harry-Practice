import java.util.*;

public class Calendar_Class {
    public static void main(String[] args) {
        
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID());
        // System.out.println(cal.getTimeZone().getDefault());
        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.getTimeZone().toZoneId());
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getWeekYear());

    }
}
