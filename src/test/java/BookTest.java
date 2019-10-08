import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before() {
        book1 = new Book("Lord of the Flies", "William Golding", "Self help");
        book2 = new Book("Dracula", "Bram Stoker", "Dating");
        book3 = new Book("Hamlet", "William Shakespeare", "Careers");
        book4 = new Book("2001", "Arthur C. Clarke", "DIY");
        book5 = new Book("Pride and Prejudice", "Jane Austen", "Party games");

    }

    @Test
    public void hasTitle() {
        assertEquals("2001", book4.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Jane Austen", book5.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Dating", book2.getGenre());
    }
}
