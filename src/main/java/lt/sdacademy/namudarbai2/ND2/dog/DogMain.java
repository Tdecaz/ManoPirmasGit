package lt.sdacademy.namudarbai2.ND2.dog;

import lt.sdacademy.namudarbai2.ND2.refactored.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogMain {

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            dogList.add(buildDog());
        }

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));

    }

    private static Dog buildDog() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite šuns vardą");
        String name = inputScanner.nextLine();

        System.out.println("Įveskite šuns amžių");
        int age = inputScanner.nextInt();

        System.out.println("Įveskite šuns spalvą");
        String color = inputScanner.nextLine();

        return new Dog(name, age, color);
    }

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        String oldestDogName = "";
        int oldestDog = dogList.get(0).getAge();

        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }

        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }

        return averageYear / dogList.size();
    }
}












/*package lt.sdacademy.namudarbai2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DogMain {


    /**   public static void main(String[] args) {

     List<Dog> dogList = new ArrayList<>();


     for int (i = 0; i <2; i++); {
     dogList.add(buildDog);

     private static Dog buildDog(){
     Scanner in
     }

     }


}}

        String[]name={"Rokis","Aras","Foksas"};
        int[]age={8,17,12};
        String[]color={"brown","black","grey"};


/*        System.out.println();
        for(int i=0;i<age.length;i++){
        System.out.print(arrayOfInts[1]+" ");
        }
        System.out.println(); //spausdina tuscia eilute

        for(int i:arrayOfInts){
        System.out.print(i+" ");


        Dog a=new a(75,2,20);
        dog.getModel();
        System.out.println(dog.getModel()); //isvesta  i ekrana 75

        int model=dog.getModel();
        System.out.println("Model is: "+model);
        System.out.println(Dog.count); // isvesta i ekrana 1

        Dog anotherBike=new Dog(80,4,25);
        System.out.println(Dog.count); // isvesta i ekrana 2

        //abiejose atvejuose isvedama reiksme true
        System.out.println(Dog.count==dog.count);
        System.out.println(dog.count==anotherBike.count);
        }
        }


        }


        }*/
