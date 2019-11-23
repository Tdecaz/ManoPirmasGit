package sandbox.skaitytuve;

import sandbox.grazintiAutorius.grazinti.sk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Skaitytuve {

    private static final String BOOK2_FILE = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\sandbox\\skaitytuve\\Skaitytuve";

    public static void main(String[] args) {
        List<sk> skSar = grazintiAutoriusIsSar();

        System.out.println(skSar);

    }

    private static List<sk> grazintiAutoriusIsSar() {
        List<sk> skSar = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(BOOK2_FILE));) {
            String line = br.readLine();

            while (line != null) {
                skSar.add(susietiDuomenisSuObjektu(line.split(",")));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return skSar;
    }

    private static sk susietiDuomenisSuObjektu(String[] Authors) {
        return new sk(Authors[0], Authors[1]);

    }
}


