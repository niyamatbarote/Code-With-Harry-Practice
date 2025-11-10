import java.util.Calendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Date of Month
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // Day of Week
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Week Number
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // Number of Day in Year
        System.out.println(c.get(Calendar.DECEMBER));
        System.out.println(c.get(Calendar.DST_OFFSET));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); // Hour of Day

        System.out.println();
        System.out.println("Lets Print Date & Time: ");
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)
                + "   " + c.get(Calendar.DAY_OF_MONTH) + " / " + c.get(Calendar.MONTH) + " / " + c.get(Calendar.YEAR));
        System.out.println(
                "Current Time: " + Calendar.HOUR_OF_DAY + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println(
                "Date: " + c.get(Calendar.DAY_OF_MONTH) + " / " + c.get(Calendar.MONTH) + " / " + c.get(Calendar.YEAR));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[88]);

    }
}
