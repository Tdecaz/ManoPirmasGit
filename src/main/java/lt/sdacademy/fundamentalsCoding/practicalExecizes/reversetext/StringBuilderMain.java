package lt.sdacademy.fundamentalsCoding.practicalExecizes.reversetext;

import java.util.Scanner;

public class StringBuilderMain {

    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ivesk");
        stringBuilder.append(scanner.nextLine());

        /*String reverseText = stringBuilder.reverse().toString() priskirti kitamajam*/

        System.out.println(stringBuilder.reverse());


    }
}
