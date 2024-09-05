package Library_managment_Finalproject_Orental;
import java.util.ArrayList;
import java.util.List;

public class Library {

        private List<Shelf> shelves;
        private List<Reader> readers;

        public Library() {
            this.shelves = new ArrayList<>();
            this.readers = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                Shelf shelf = new Shelf();
                shelf.addBook(new Book("Author1", "Book1", 50));
                shelf.addBook(new Book("Author2", "Book2", 100));
                shelves.add(shelf);
            }
        }

        public boolean isTherePlaceForNewBook() {
            for (Shelf shelf : shelves) {
                if (!shelf.isShelfFull()) {
                    return true;
                }
            }
            return false;
        }

        public void addNewBook(Book book) {
            for (Shelf shelf : shelves) {
                if (!shelf.isShelfFull()) {
                    if (shelf.addBook(book)) {
                        System.out.println(" This book added to the library");
                    }
                    return;
                }
            }
            System.out.println("There is No space available in the library");
        }

        public void deleteBook(String title) {
            for (Shelf shelf : shelves) {
                for (Book book : shelf.getBooks()) {
                    if (book.getTitle().equals(title)) {
                        shelf.getBooks().remove(book);
                        System.out.println("This book removed from the library");
                        return;
                    }
                }
            }
            System.out.println("Book not found.");
        }

        public void registerReader(int id, String name) {
            readers.add(new Reader(id, name));
            System.out.println("New reader registered.");
        }

        public void removeReader(String name) {
            readers.removeIf(reader -> reader.getName().equals(name));
            System.out.println("Reader removed.");
        }

        public void searchByAuthor(String author) {
            List<String> titles = new ArrayList<>();
            for (Shelf shelf : shelves) {
                for (Book book : shelf.getBooks()) {
                    if (book.getAuthor().equals(author)) {
                        titles.add(book.getTitle());
                    }
                }
            }
            if (!titles.isEmpty()) {
                System.out.println(author + titles);
            } else {
                System.out.println("There is No books found for this author.");
            }
        }
    }




