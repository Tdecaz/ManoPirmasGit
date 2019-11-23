package lt.sdacademy.fundamentals.loop.foreach;


public class Example1 {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3};
        Animal dog = new Animal("boss", "Boxer", "8","brown","long");
        Animal cat = new Animal("Dolly", "Ciau Ciau", "7", "white", "short");

        Animal[] animals = {dog, cat};

        for (Animal a : animals) {
            {
                System.out.println(a.getBreed());
            }
        }

        for (Animal a : animals) {
            {
                System.out.println(a.getAge());
            }
        }
}
}
        class Animal {

            //kintamieji
            private String name;
            private String breed;
            private String age;
            private String color;
            private String fur;

            //Konstruktorius
            Animal(String name, String breed, String age, String color, String fur) {
                this.name = name;
                this.breed = breed;
                this.age =  age;
                this.color = color;
                this.fur = fur;

            }
                // Kintamojo getteris
                public String getBreed () {
                    return breed;
                }

                public String getAge() {
                    return age;
            }
        }
