package lt.sdacademy.namudarbai2.ND3.refactored;


import lt.sdacademy.namudarbai2.ND3.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CarMainRefactored {

    private static final String CAR_FILE = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\lt\\sdacademy\\namudarbai2\\ND3\\refactored\\CarData.txt";

    public static void main(String[] args) {
        List<Car> carList = getCarFromFile();

        // rezultatu isvedimas
        System.out.println("Naujausio automobilio modelis: " + findNewestCar(carList));
        System.out.println("Vidutiniai automobilių pagaminimo metai: " + findAverageYearOfCars(carList));
        System.out.println("Brangiausio automobilio modelis: " + findMostExpensiveCar(carList));
    }

    // listo sukurimas
    private static List<Car> getCarFromFile() {
        List<Car> carList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(CAR_FILE));) {
            String line = br.readLine();

            while (line != null) {
                carList.add(mapDataToObject(line.split(",")));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return carList;
    }

    private static Car mapDataToObject(String[] carData) {
        return new Car(carData[0], Double.parseDouble(carData[1]), Integer.parseInt(carData[2]), Integer.parseInt(carData[3]), carData[4]);

    }

    private static String findNewestCar(List<Car> carList) {
       /*return carList.stream()
                .max(Comparator.comparingInt(Car::getyear))
                .get()
                .getmodel();*/

        String newestCarName = "";
        int newestCar = carList.get(0).getyear();

        // newestCarName() = Math.(newestCar, car.getyear) - pasiaiskinti su Math funkcija

        for (Car car : carList) {
            if (newestCar < car.getyear()) {
                newestCar = car.getyear();
                newestCarName = car.getmodel();
            }
        }

        return newestCarName;
    }

    // vidurkis
    private static double findAverageYearOfCars(List<Car> carList) {
        double averageYear = 0;

        for (Car car : carList) {
            averageYear += car.getyear();
        }

        return averageYear / carList.size();
    }

    // brangiausias masinos modelis
    private static String findMostExpensiveCar(List<Car> carList) {

        String mostExpensiveCarModel = "";
        int mostExpensiveCar = carList.get(0).getprice();

        for (Car car : carList) {
            if (mostExpensiveCar > car.getprice()) {
                mostExpensiveCar = car.getprice();
                mostExpensiveCarModel = car.getmodel();
            }
        }
        return mostExpensiveCarModel;
    }
}