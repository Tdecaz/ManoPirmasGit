package lt.sdacademy.fundamentalsCoding.practicalExecizes.factorial;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class factorialMain {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu");

        int result = 1;
        int n = numberScanner.nextInt();
        int x;
        for (x = 1; x <= n; x++) {
            result *= x;

        }
        System.out.println(result);


    }
}
