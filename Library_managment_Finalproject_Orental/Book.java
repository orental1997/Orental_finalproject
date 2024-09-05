package Library_managment_Finalproject_Orental;



public class Book {
    private String author;
    private  String title;
    private int numOfPages;

    public Book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String toString() {
        return title + " by " + author + " (" + numOfPages + " pages)";
    }
}
