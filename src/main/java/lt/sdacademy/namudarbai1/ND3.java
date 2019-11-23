package lt.sdacademy.namudarbai1;

import java.util.Scanner;

public class ND3 {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk x asies skaiciu");
        int x = numberScanner.nextInt();
        System.out.println("Ivesk y asies skaiciu");
        int y = numberScanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Koordinate yra I ketvirtyje");
        } else if (x > 0 && y < 0) {
            System.out.println("Koordinate yra II ketvirtyje");
        } else if (x < 0 && y < 0) {
            System.out.println("Koordinate yra III ketvirtyje");
        } else if (x < 0 && y > 0) {
            System.out.println("Koordinate yra IV ketvirtyje");
        } else if (x == 0 && y > 0) {
            System.out.println("Koordinate yra ant Y asies, tarp I ir IV ketvirciu");
        } else if (x == 0 && y < 0) {
            System.out.println("Koordinate yra ant Y asies, tarp II ir III ketvirciu");
        } else if (x > 0 && y == 0) {
            System.out.println("Koordinate yra ant X asies, tarp I ir II ketvirciu");
        } else if (x < 0 && y == 0) {
            System.out.println("Koordinate yra ant X asies, tarp III ir IV ketvirciu");
        } else if (x == 0 && y == 0) {
            System.out.println("Koordinate yra ant X ir Y asiu, tarp visu ketvirciu");
        } else {
            System.out.println("nezinomas veiksmas");


        }
    }


}



