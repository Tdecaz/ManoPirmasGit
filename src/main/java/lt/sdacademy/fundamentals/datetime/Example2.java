package lt.sdacademy.fundamentals.datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Example2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime.of(2019, Month.NOVEMBER, 15, 11, 45);
        LocalDateTime.parse("2019-11-15T11:45:00");

        now=now.plusDays(1);
        now=now.minusHours(2);

        System.out.println(now.getMonth());
        System.out.println(now);

    }






}
