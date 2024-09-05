package Library_managment_Finalproject_Orental;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    private int id;
    private String name;
    private List<String> books;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void readBook(String bookTitle) {
        books.add(bookTitle);
    }

    public List<String> getBooks() {
        return books;
    }

    public String toString() {
        return "Reader: " + name + ", Books Read: " + books.toString();
    }
}

