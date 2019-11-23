package lt.sdacademy.fundamentalsCoding.practicalExecizes.circle;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk apskrtimo skersmeni");
        int skersmuo = numberScanner.nextInt();
// int a;

        System.out.println("Ivesk apskrtimo spalva");
        String spalva = sc.nextLine();

        System.out.println("Apskritimo ilgis " + ilgis(skersmuo));
        System.out.println("Apskritimo ilgis " + plotas(skersmuo));
        System.out.println(spalva);


    }


    private static int ilgis(int skersmuo) {
        int ilgis = (int) Math.PI*skersmuo;
        return ilgis;
    }
    private static int plotas(int skersmuo) {
        int plotas = (int) Math.PI * (int) (skersmuo / 2) * (skersmuo / 2);
        return plotas;
    }


}