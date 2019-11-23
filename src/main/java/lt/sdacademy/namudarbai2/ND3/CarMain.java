package lt.sdacademy.namudarbai2.ND3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
// listo sukurimas
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 2 /*Kiek kartu suks cikla*/; i++) {
            carList.add(buildCar());
        }
// rezultatu isvedimas
        System.out.println("Naujausio automobilio modelis: " + findNewestCar(carList));
        System.out.println("Vidutiniai automobilių pagaminimo metai: " + findAverageYearOfCars(carList));
        System.out.println("Brangiausio automobilio modelis: " + findMostExpensiveCar(carList));
    }

    // masinu ivedimas
    private static Car buildCar() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite automobilio modelį");
        String model = inputScanner.nextLine();

        System.out.println("Įveskite automobilio tipą"); //KODEL NEDUODA I GALA DETI IR SKIPINA????????????????
        String type = inputScanner.nextLine();

        System.out.println("Įveskite automobilio variklio tūrį");
        double engine = inputScanner.nextDouble();

        System.out.println("Įveskite automobilio pagaminimo datą");
        int year = inputScanner.nextInt();

        System.out.println("Įveskite automobilio kainą");
        int price = inputScanner.nextInt();

        //inputScanner.nextLine();   - Isivesti tuscia eilute

        return new Car(model, engine, year, price, type);
    }

    // naujausios masinos modelis
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