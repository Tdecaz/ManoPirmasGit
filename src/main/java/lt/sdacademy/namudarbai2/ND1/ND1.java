package lt.sdacademy.namudarbai2.ND1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ND1 {

    public static void main(String[] args) {

        String sentencija = new String("Ad Astra Per Aspera");
        System.out.println(sentencija.toLowerCase());
        System.out.println(sentencija.toUpperCase());
        System.out.println(sentencija.toLowerCase().replace('a','x'));
        System.out.println(Pattern.matches("Ad.+", "Ad Astra Per Aspera"));  //true

        // elpasto validacija

       /* Pattern emailPatter = Pattern.compile("^(.+)@(.+)$"); // ^ - pradzia, & - galas, . - bet kas, + - bet koks ilgis, \\. - taskas
        Matcher emailMatcher = emailPatter.matcher("Ad.+");
        System.out.println(emailMatcher.matches()); //true */
    }
}
