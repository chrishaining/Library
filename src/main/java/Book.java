public class Book {

    //instance variables
    private String title;
    private String author;
    private String genre;

    //constructor
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //getter for title
    public String getTitle() {
        return this.title;
    }

    //getter for author
    public String getAuthor() {
        return this.author;
    }

    //getter for genre
    public String getGenre() {
        return this.genre;
    }
}


