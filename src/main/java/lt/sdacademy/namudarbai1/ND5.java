package lt.sdacademy.namudarbai1;

import java.util.Scanner;

public class ND5 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

            System.out.println("Ivesk savaites diena");
            String Diena = myObj.nextLine();

            switch (Diena) {
                case ("Pirmadienis"): {
                    System.out.println("1");
                    break;
                }
                case ("Antradienis"): {
                    System.out.println("2");
                    break;
                }
                case ("Treciadienis"): {
                    System.out.println("3");
                    break;
                }
                case ("Ketvirtadienis"): {
                    System.out.println("4");
                    break;
                }
                case ("Penktadienis"): {
                    System.out.println("5");
                    break;
                }
                case ("Sestadienis"): {
                    System.out.println("6");
                    break;
                }
                case ("Sekmadienis"): {
                    System.out.println("7");
                    break;
                }

                default: {
                    System.out.println("Neatpazinta savaites diena");
                }
            }
    }
}
