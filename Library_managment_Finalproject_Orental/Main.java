package Library_managment_Finalproject_Orental;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. For adding a book - Press 1");
                System.out.println("2. For deleting a book - Press 2");
                System.out.println("3. For registering a new reader - Press 3");
                System.out.println("4. For removing a reader - Press 4");
                System.out.println("5. For searching books by author – Press 5");
                System.out.println("6. For exit – Press 6");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the author name");
                        String author = scanner.nextLine();
                        System.out.println("Enter title");
                        String title = scanner.nextLine();
                        System.out.println("Enter number of pages");
                        int numOfPages = scanner.nextInt();
                        scanner.nextLine();

                        Book newBook = new Book(author, title, numOfPages);
                        library.addNewBook(newBook);
                        break;

                    case 2:
                        System.out.println("Please enter the title of the book that you want to delete");
                        String deleteTitle = scanner.nextLine();
                        library.deleteBook(deleteTitle);
                        break;

                    case 3:
                        System.out.println("Enter the reader name");
                        String name = scanner.nextLine();
                        System.out.println("Enter reader ID is");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        library.registerReader(id, name);
                        break;

                    case 4:
                        System.out.println("Please enter the reader name that you want to remove");
                        String removeName = scanner.nextLine();
                        library.removeReader(removeName);
                        break;

                    case 5:
                        System.out.println("Please enter the author name to search:");
                        String searchAuthor = scanner.nextLine();
                        library.searchByAuthor(searchAuthor);
                        break;

                    case 6:
                        System.out.println("Exit the program.");
                        scanner.close();
                        return;

                    default:
                        System.out.println(" Please try again.");
                }
            }
        }
    }

