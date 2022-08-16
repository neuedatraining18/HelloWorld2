import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime lunchTime = LocalTime.of(13,30);
        System.out.println(lunchTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));

        LocalDate myBirthday = LocalDate.of(1995,12,20);
        Period period = Period.between(myBirthday,today);
        System.out.println("I am " + period.getYears() + " years, " + period.getMonths() +
                " months, and " + period.getDays() + " days old.");

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        Instant rightNow = Instant.now();
        System.out.println(rightNow);
        Duration.between(rightNow, Instant.now());

    }
}
