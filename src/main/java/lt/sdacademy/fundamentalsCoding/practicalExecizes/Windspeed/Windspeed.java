package lt.sdacademy.fundamentalsCoding.practicalExecizes.Windspeed;

import java.util.Scanner;

public class Windspeed {

    private static final double NAUTICAL_MILE = 1.852;
    private static final double BEAUFORT_COSTANT = 3.01;

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk vejo greiti");
        int kmh = numberScanner.nextInt();
        int a;

        System.out.println("Mazgai: " + knots(kmh));
        System.out.println("Bofortas: " + bkmh(kmh) );
        System.out.println("Stipris: " + vejostipr(kmh));

        /*System.out.println("Greitis mazgais :" + kmh * NAUTICAL_MILE);

        int bscal = (int) (Math.pow(kmh / BEAUFORT_COSTANT, 1.5));

        if (bscal >= 20) {
            System.out.println("Vejas Beauforto skaleje : 20");
        } else {
            {
                System.out.println(bscal);
            }

            if (kmh <= 20) {
                System.out.println("silpnas");
            } else {
                System.out.println("stiprus");
            }*/

           /*kmh <=20 ? "ramus" : "stiprus";*/
        }

    private static int knots(int a) {
        return (int) (NAUTICAL_MILE * a);
    }
    private static int bkmh(int kmh) {
        int bkmh = (int) Math.pow(kmh / BEAUFORT_COSTANT, 1.5);
        return Math.min(bkmh, 12);
    }
    private static String vejostipr(int kmh) {
        return kmh <= 20 ? "ramus" : "stiprus";
    }
}



/*
 * 1 ivesdamas vejo greitis
 * 2. paverciamas vejo geitis is km/h i greiti mazgas
 * 3. Vejo greiti Beauforto skaleje Math.pow (greitis, laipsnis) Beuforto skales formule = vejo greitis : 3.01 ^1.5
 * 3.1 Beauforto skales matmuo negali buti didesnis nei
 * 4. Jei vejo greitis didesnis nei 20 km -> stiprus
 * 5. Atspausdinti rezultatus.
 * */