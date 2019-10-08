import java.util.ArrayList;

public class Library {

    //instance variables
    private String name;
    private int capacity;
    private ArrayList<Book> stock;


    //constructor
    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    //getter for name
    public String getName() {
        return this.name;
    }
    //getter for capacity
    public int getCapacity() {
        return this.capacity;
    }

    //Write a method to count the number of books in the library.
    public int countStock() {
        return this.stock.size();
    }

    //Write a method to add a book to the library stock.
    //Add a capacity to the library and write a method to check if stock is full before adding a book.
    public void addBook(Book book) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(book);
        }
    }

    //remove a book from the stock
    public void removeBook(Book book) {
        if (this.stock.size() > 0) {
            this.stock.remove(book);
        }
    }


    //view the entire library
}
