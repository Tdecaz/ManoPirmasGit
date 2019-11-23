package lt.sdacademy.fundamentalsCoding.practicalExecizes.triangle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class trianglesMain {

    public static final String TRIANGLE_FILE_LOCATION = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\lt\\sdacademy\\fundamentalsCoding\\practicalExecizes\\triangle\\tiranglesData.txt";
    public static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\lt\\sdacademy\\fundamentalsCoding\\practicalExecizes\\triangle\\trianglesOutputData.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();
        findPerimeter(triangles);
        irasytiDuomenisIFaila(triangles);
    }

    // listo sukurimas
    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangleList = new ArrayList();

        try (BufferedReader tr = new BufferedReader(new FileReader(TRIANGLE_FILE_LOCATION))) {
            String line = tr.readLine();

            while (line != null) {
                triangleList.add(mapTriangleData(line.split(",")));
                line = tr.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return triangleList;
    }

    private static Triangle mapTriangleData(String[] triangleData) {
        return new Triangle(Integer.parseInt(triangleData[0]), Integer.parseInt(triangleData[1]), Integer.parseInt(triangleData[2]), TriangleType.valueOf(triangleData[3]));
    }

    private static void findPerimeter(List<Triangle> triangleList) {
        int perimeter;

        for (Triangle triangle : triangleList) {
            perimeter = triangle.getA() + triangle.getB() + triangle.getC();
            triangle.setPerimeter(perimeter);

        }
    }

    public static void irasytiDuomenisIFaila(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            // istrinti    bw.write(data);
            for (Triangle triangle : triangles) {
                bw.write(triangle.getTriangleType().getTriangleDescription() + triangle.getperimeter());
            }

        } catch (FileNotFoundException e) {
            System.out.println("klaida irasant i faila");

        } catch (IOException e) {
            System.out.println("Ivyko klaida renkant faila");

        }

    }

}











