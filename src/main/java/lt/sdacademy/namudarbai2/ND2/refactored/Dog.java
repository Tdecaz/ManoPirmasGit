package lt.sdacademy.namudarbai2.ND2.refactored;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}








/*public class Dog {

    private String name;
    private int age;
    private String color;
    static int count = 0;

    public Dog(String name, int age, String color) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.count++;

    }
    public int getAge() {
        return age;
    }

    /*public static int getCount() {
        return count;

    }

}
*/