package period;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Period period = Period.of(5, 4, 3);
        Period period1 = Period.ofDays(2);
        Period period2 = Period.ofMonths(2);
        Period period3 = Period.ofWeeks(2);
        Period period4 = Period.ofYears(2);

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);

        System.out.println("-------");

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        long days1 = period.get(ChronoUnit.DAYS);

        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
        System.out.println(days1);



    }
}
