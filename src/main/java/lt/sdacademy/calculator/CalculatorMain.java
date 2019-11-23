package lt.sdacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /*Scanner numberScanner = new Scanner(System.in);*/
        Scanner actionScanner = new Scanner(System.in);

        double result = 0;
        boolean calculate = true;

        while (calculate) {

           /* System.out.println("Ivesk pirma skaiciu");
            int firstNum = numberScanner.nextInt();

            System.out.println("Ivesk antra skaiciu");
            int secondNum = numberScanner.nextInt();*/

            double firstNum = getNum("Ivesk pirma skaiciu");
            double secondNum = getNum("Ivesk antra skaiciu");

            System.out.println("Koki veiksma nori atlikti: + - * /");
            String action = actionScanner.nextLine();

            result = getresult(action, firstNum, secondNum);
            System.out.println("rezultatas: " + result);


       /* if (action.equals("+")) {
            System.out.println(firstNum + secondNum);
        } else if (action.equals("-")) {
            System.out.println(firstNum - secondNum);
        } else if (action.equals("*")) {
            System.out.println(firstNum * secondNum);
        } else if (action.equals("/")) {
            System.out.println(firstNum / secondNum);
        } else {
            System.out.println("nezinomas veiksmas");*/

            System.out.println("ar norite skaiciuoti toliau? TAIP : NE");
            String answer = actionScanner.nextLine();
            /*if (answer.equals("NE")) {
                calculate = false;*/
            if (answer.equals("NE") || answer.toLowerCase().equals("ne")) {
                calculate = false;

               /* if (answer.equalsIgnoreCase("NE"))  {
                calculate = false; */  // trumpesnis lower case
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }

    private static double getresult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nerastas");
            }
        }
        return 0;
    }
}
