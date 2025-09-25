
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDuractionDemo {
    public static void main(String[] args) {
        getPeriod();
        getDuraction();
    }

    public static void getPeriod(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2000,12 ,11);

        Period period = Period.between(date2, date1);
        System.out.println("Period btn dates: " + period);

    }

    public static void getDuraction(){
        LocalTime time1= LocalTime.now();

        Duration plus = Duration.ofHours(2);//Add 2 Hr
        LocalTime time3 = time1.plus(plus);


        Duration gap = Duration.between(time3, time1);

        System.out.println("Before adding Hours: " + time1);
        System.out.println("After adding Hours: " + time3);
        System.out.println("Gap between both: " + gap);
    }
}
