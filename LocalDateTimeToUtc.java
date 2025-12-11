package Programs.BasicPrograms;

import java.time.*;

public class LocalDateTimeToUtc {
//    public static void main(String[] args) {
//        // Example: your local date and time
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("LocalDateTime: "+ localDateTime);
//
//        // Convert to ZonedDateTime in system default zone
//        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
//
//        // Convert to UTC Instant
//        Instant utcInstant = zonedDateTime.toInstant();
//
//        // Format as ISO 8601 string ending with Z
//        String utcString = utcInstant.toString();
//
//        System.out.println("UTC DateTime (ISO 8601 with Z): " + utcString);
//    }
public static void main(String[] args) {
    String dateTimeString = "2025-07-25T13:38:11.797117150";
    LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString);
    System.out.println("Local DateTime       : " + localDateTime);

    // Convert to UTC OffsetDateTime with Z
    OffsetDateTime utcOffsetDateTime = convertLocalDateTimeToUtc(localDateTime);
    System.out.println("UTC OffsetDateTime   : " + utcOffsetDateTime);
}

    public static OffsetDateTime convertLocalDateTimeToUtc(LocalDateTime localDateTime) {
        ZonedDateTime zoned = localDateTime.atZone(ZoneId.systemDefault()); // IST for example
        return zoned.withZoneSameInstant(ZoneOffset.UTC).toOffsetDateTime(); // Convert to UTC with Z
    }
}
