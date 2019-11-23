package lt.sdacademy.fundamentals.objectoriented.room;

import java.util.Scanner;

public class RoomMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesk kambario ilgi");
        int width = scanner.nextInt();

        System.out.println("Ivesk kambario ploti");
        int length = scanner.nextInt();

        Room room = new Room(width, length);

        int plotas = getplotas(room.getLength(), room.getwidth());
        System.out.println("Kambario plotas: " + plotas);
    }

    private static int getplotas(int length, int width) {
        return length * width;   // geteris
    }

}
