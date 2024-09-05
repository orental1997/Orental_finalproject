package Library_managment_Finalproject_Orental;
import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books;
    private boolean isShelfFull;

    public Shelf() {
        this.books = new ArrayList<>();
        this.isShelfFull = false;
    }

    public boolean addBook(Book book) {
        if (books.size() < 5) {
            books.add(book);
            if (books.size() == 5) {
                isShelfFull = true;
            }
            return true;
        } else {
            System.out.println("There is No space left on the shelf.");
            return false;
        }
    }
    public void replaceBooks(int position1, int position2 ) {
        if (position1 < 1 || position2 < 1 || position1 > 5 || position2 > 5) {
            System.out.println("Invalid positions.");
            return;
        }
        if (position1 <= books.size() && position2 <= books.size()) {
            Book temp = books.get(position1 - 1);
            books.set(position1 - 1, books.get(position1 - 1));
            books.set(position2 - 1, temp);
        } else {
            System.out.println("There is an empty position");
        }
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String toString() {
        return "Shelf: " + books.toString();
    }
}

