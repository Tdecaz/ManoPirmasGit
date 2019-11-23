package lt.sdacademy.fundamentalsCoding.practicalExecizes.reversetext;

import java.util.Scanner;

public class reverseText {

    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        String text;
        String reverseText = "";

        System.out.println("ivesk testa");
        text = textScanner.nextLine();

        for (int i = text.length() - 1;
        i >= 0;
        i--){
            reverseText += text.charAt(i);

            System.out.println(reverseText);
        }
    }
}
