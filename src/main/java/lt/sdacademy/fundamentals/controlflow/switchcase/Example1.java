package lt.sdacademy.fundamentals.controlflow.switchcase;

public class Example1 {

    public static void main(String[] args) {
        char direction = 'w';

        switch (direction) {
            case /* case = else if */'n': {
                System.out.println("Siaure");
                break;
            }
            case 's': {
                System.out.println("Pietus");
                break;
            }
            case 'e': {
                System.out.println("rytai");
                break;
            }
            case 'w': {
                System.out.println("vakarai");
                break;


            }
        }

    }
}
