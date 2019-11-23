package lt.sdacademy.fundamentalsCoding.practicalExecizes.bookAndAuthor;

public class Author {

    private String name;
    private String email;
    private String phoneNumber;

    public Author(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

   /* public String name() { return name; }
    public String email() { return email; }
    public String phoneNumber() { return phoneNumber; }*/

    public String toString() {
        return String.format("Autoriaus vardas: %s, pastas: %s", name, email);
    }
}


