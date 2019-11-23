package sandbox.grazintiAutorius.grazinti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AutoriaiPagrind {

    private static final String BOOK3_FILE = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\sandbox\\grazintiAutorius\\grazinti\\AutoriuSarasas.txt";

    public static void main(String[] args) {
        List<sk> autoriuSar = susietiAutoriusIsSaraso();
        System.out.println(autoriuSar);

    }
        private static List<sk> susietiAutoriusIsSaraso() {
            List<sk> autoriuSar = new ArrayList();

            try (BufferedReader br = new BufferedReader(new FileReader(BOOK3_FILE));) {
                String line = br.readLine();

                while (line != null) {
                    autoriuSar.add(susietiDuomenisSuObjektu(line.split(",")));
                    line = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("KLAIDA");
            }
            return autoriuSar;
        }
    private static sk susietiDuomenisSuObjektu(String[] Authors) {
        return new sk(Authors[0], Authors[1]);

    }
}
