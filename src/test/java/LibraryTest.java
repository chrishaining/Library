import static org.junit.Assert.*;
        import org.junit.Before;
        import org.junit.Test;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before() {
        library = new Library("Jupiter Grand Central Library", 4);
        book1 = new Book("Lord of the Flies", "William Golding", "Self help");
        book2 = new Book("Dracula", "Bram Stoker", "Dating");
        book3 = new Book("Hamlet", "William Shakespeare", "Careers");
        book4 = new Book("2001", "Arthur C. Clarke", "DIY");
        book5 = new Book("Pride and Prejudice", "Jane Austen", "Party games");
    }

    //test library has name
    @Test
    public void hasName() {
        assertEquals("Jupiter Grand Central Library", library.getName());
    }


    //test library has capacity
    @Test
    public void hasCapacity() {
        assertEquals(4, library.getCapacity());
    }

    //  count the number of books in the library.
    @Test
    public void stockIsEmptyAtStart() {
        assertEquals(0, library.countStock());
    }

    // add a book to the library stock.
    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countStock());
    }

    // check if stock is full before adding a book.
    @Test
    public void doesNotAddBookIfCapacityHasBeenReached() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        assertEquals(4, library.countStock());
    }


    //remove a book from the stock
    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.countStock());
    }

    //user can view the entire library stock (title, author and genre of each book)
//    @Test
//    public void canViewStock() {
//        library.addBook(book1);
//        library.addBook(book2);
//        assertEquals({book1, book2}, library.viewStock());
//    }

}