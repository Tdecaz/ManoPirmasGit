package lt.sdacademy;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 498;
        array[1] = 558;

        for (int i = 0; i < 5; i = i + 1) {
            if (i < 2) {
                System.out.println("int maziau uz 2");
            } else if (i == 3) {
                System.out.println("indexas lygus 3-imsint maziau uz 3");
            } else {
                System.out.println("indexas daugiau uz 3");
            }


        }
    }
}