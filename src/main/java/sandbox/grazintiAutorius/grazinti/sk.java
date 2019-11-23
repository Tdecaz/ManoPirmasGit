package sandbox.grazintiAutorius.grazinti;

public class sk {

    private String name1;
    private String name2;

    public sk(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

   /* public String name() { return name; }
    public String email() { return email; }
    public String phoneNumber() { return phoneNumber; }*/

    public String toString() {
        return String.format(name1, name2);
    }
}




