package lt.sdacademy.fundamentals.datetime;

import java.io.StringWriter;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {
    public static void main(String[] args) {

        Date now = new Date();
        //Arba

        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now); // Sun Nov 10 11:25:32 EET 2019

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // konvertuojama i date objekta
        System.out.println(date); // Sun Nov 10 11:25:32 EET 2019

        cal.setTime(now); // date konvertuojama i Calendar objekta
        System.out.println(cal.get(Calendar.YEAR)); // 2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 314
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 45

        String dateInText = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateInText);
        System.out.println(localDate);


    }
}








