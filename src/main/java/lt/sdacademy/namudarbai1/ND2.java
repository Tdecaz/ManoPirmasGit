package lt.sdacademy.namudarbai1;

import java.util.Scanner;

public class ND2 {

    public static void main(String args[]) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk skaiciu");
        int n = numberScanner.nextInt();
        int i, m = 0, flag = 0;

        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " nera pirminis skaicius");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " nera pirminis skaicius");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " yra pirminis skaicius");
            }
        }//end of else
    }
}