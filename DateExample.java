import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String args[]){
        LocalDateTime currentDateAndTime=LocalDateTime.now();
        System.out.println("Current date and time is:"+currentDateAndTime);
        LocalDate currentDate=LocalDate.now();
        System.out.println("Current date is:"+currentDate);
        //yesterday
        LocalDate yesterdayDate=currentDate.minusDays(1);
        System.out.println("Yesterday Date is:"+yesterdayDate);
        //tomorrow
        LocalDate tomorrowDate=currentDate.plusDays(1);
        System.out.println("Yesterday Date is:"+tomorrowDate);
        //"yyyy-MM-dd"
        System.out.println("(yyyy-MM-dd):"+currentDateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //"dd/MM/yyyy"
        System.out.println("(dd-MM-yyyy):"+currentDateAndTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        //"MM/dd/yyyy"
        System.out.println("(MM--dd-yyyy):"+currentDateAndTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        //"yyyy-MM-dd-HH-mm-ss-ns"
        System.out.println("(yyyy-MM-dd-HH-mm-ss-ns):"+currentDateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-ns")));
        //Month date, year
        System.out.println("Month date,year:"+currentDateAndTime.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
        // Convert long value to Date and UTC time
        long longValue=1700000000000L;
        Instant instant=Instant.ofEpochMilli(longValue);
        // Convert to LocalDateTime
        LocalDateTime dateTimeFromLong =LocalDateTime.ofInstant(instant,ZoneId.systemDefault());
        System.out.println(String.format("Local date and time is:" + dateTimeFromLong.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"))));
        // Convert to UTC
        ZonedDateTime utcFromLong=instant.atZone(ZoneId.of("UTC"));
        System.out.println("UTC is:"+utcFromLong.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss 'UTC'")));
    }
}
