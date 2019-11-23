package lt.sdacademy.fundamentals.controlflow.ifelse;

public class Example2 {

    public static void main(String[] args) {

        int age = 110;

        if (age < 18) {
            System.out.println("Tu paauglys");
        } else if (age > 100) {
            System.out.println("Tu labai senes");
        } else {
            {
                System.out.println("Tu suauges");
            }
        }
    }
}