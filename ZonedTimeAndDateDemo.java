
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedTimeAndDateDemo {
 public static void main(String[] args) {
     ZonedTimeAndDate();
 }   

 public static void ZonedTimeAndDate(){
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss") ;
    String formatedDate =date.format(dateTimeFormatter);
    System.out.println("Formated Date: " + formatedDate);
    
    //Current Zone
    ZonedDateTime currentZone = ZonedDateTime.now();
    System.out.println("Current Zone:" + currentZone.getZone());

    // getting time zone of specific place
    // we use withZoneSameInstant(): it is
    // used to return a copy of this date-time 
    // with a different time-zone,  
    // retaining the instant.
    ZoneId tokyo = ZoneId.of("Asia/Tokyo");

    ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
    System.out.println("tokyo time zone is " + tokyoZone);

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    String formatedDateTime = tokyoZone.format(format); 

    System.out.println("formatted tokyo time zone "+ formatedDateTime);
 }
}
