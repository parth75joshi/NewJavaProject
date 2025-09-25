
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApiDemo {
    public static void main(String[] args) {
        DateClass dateClass = new DateClass();
        dateClass.LocalDateTime();
    }
}

class DateClass{
    public static void LocalDateTime() {
        LocalDate localDate = LocalDate.now();  
        System.out.println("Current Date: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = dateTime.format(dateTimeFormatter);
        
        System.out.println("Formated DateTime: " + date);

        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int seconds = dateTime.getSecond();

        System.out.println("Month: " + month.toString() + "Days: " + day + "Time: " + seconds);

        LocalDate customDate = LocalDate.of(2000, 1, 30);
        System.out.println("Custom Date: " + customDate);
    } 
}
