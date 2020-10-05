import java.util.ArrayList;


public class Library {

    private final ArrayList<Book> books = new ArrayList<>();

    public void putBook(String bookName, Book book) {
        books.add(book);
    }

    public ArrayList<Book> findByAuthor(String authorName) {

        ArrayList<Book> authorBooks = new ArrayList<>();

        books.forEach(book -> {
            if (book.getAuthor().getName().equals(authorName)) {
                authorBooks.add(book);
            }
        });
        return authorBooks;
    }

}
