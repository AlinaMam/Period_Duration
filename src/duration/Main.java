package duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Duration oneDay = Duration.ofDays(1);
        Duration oneHour = Duration.ofHours(1);
        Duration oneMin = Duration.ofMinutes(1);
        Duration tenSeconds = Duration.ofSeconds(10);
        Duration twoSeconds = Duration.ofSeconds(1, 1_000_000_000);
        Duration millis = Duration.ofMillis(1);
        Duration oneSecond = Duration.of(1, ChronoUnit.SECONDS);

        System.out.println("oneDay " + oneDay);
        System.out.println("oneHour " + oneHour);
        System.out.println("oneMin " + oneMin);
        System.out.println("tenSeconds " + tenSeconds);
        System.out.println("twoSeconds " + twoSeconds);
        System.out.println("millis " + millis);
        System.out.println("oneSecond " + oneSecond);


    }
}
