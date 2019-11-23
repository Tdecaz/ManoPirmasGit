package lt.sdacademy.fundamentals.filewrite;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

    private static final String OUTPUT_FILEWRITE = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\lt\\sdacademy\\fundamentals\\filewrite\\failas.txt";

    public static void main(String[] args) {

        String text = "Good mornong";

        writeDataToFile(text);
    }


    public static void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILEWRITE))) {
            bw.write(data);

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");

        } catch (IOException e) {
            System.out.println("Ivyko klaida renkant faila");

        }

    }
}
