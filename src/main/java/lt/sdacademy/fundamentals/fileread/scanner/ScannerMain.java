package lt.sdacademy.fundamentals.fileread.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.fileread.Util.FILE_LOCATION;

public class ScannerMain {

    public static void main(String[] args) {

        //need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()) ;
            System.out.println(fileScanner.nextLine());

        fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }

        //Closes automatcally
        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext())
                System.out.println(fileScanner.nextLine());
        }
            catch (IOException e) {
                System.out.println("KLAIDA");
            
        }

    }

}
