/*package lt.sdacademy.fundamentalsCoding.practicalExecizes.bookAndAuthor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAndAuthorsMain {

    private static final String BOOK_FILE = "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\main\\java\\lt\\sdacademy\\fundamentalsCoding\\practicalExecizes\\bookAndAuthor\\BooksData";

    public static void main(String[] args) {
        List<Book> bookList = getBookFromFile();
        List<Author> authorList = getAuthorFromFile();

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    // listo sukurimas
    private static List<Book> getBookFromFile() {
        List<Book> bookList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(BOOK_FILE));) {
            String line = br.readLine();

            while (line != null) {
                bookList.add(mapBookData(line.split(";")));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return bookList;
    }

    private static Book mapBookData(String[] bookData) {
        return new Book(bookData[3], bookData[4], Double.parseDouble(bookData[5]), Integer.parseInt(bookData[6]));
    }


    private static List<Author> getAuthorFromFile() {
        List<Author> authorList = new ArrayList();

        try (BufferedReader ar = new BufferedReader(new FileReader(BOOK_FILE));) {
            String line = ar.readLine();

            while (line != null) {
                authorList.add(mapAuthorData(line.split(";")));
                line = ar.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");

        }
        return authorList;
    }

    private static Author mapAuthorData(String[] authorData) {
        return new Author(authorData[0], authorData[1], authorData[2]);

    }


}*/