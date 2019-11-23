package lt.sdacademy.fundamentals.array;

public class Example1 {

    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];

        arrayOfInts[0] = 10;
        arrayOfInts[1] = 15;
        arrayOfInts[2] = 20;
        arrayOfInts[3] = 25;
        arrayOfInts[4] = 30;

        /* for(int value: arrayOfInts) {
            System.out.println(value);
        }*/

        for (int i = 0; i < arrayOfInts.length + 1; i++) {

            try {
                System.out.println(arrayOfInts[i]);
            } catch (Exception e) {
                System.out.println("Klaida!");
            }

            /*System.out.println(arrayOfInts[i]);*/
        }
    }
}
