import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static final LibraryFactory libraryFactory = new LibraryFactory();

    private static final Library library = libraryFactory.crateLibrary();

    public static void main(String[] args) {
        String name = setName();
        getBooks(name);
    }

    private static String setName() {
        System.out.println("Введите имя автора, книги которого хотите найти ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void getBooks(@NotNull String name) {

        ArrayList<Book> authorBooks = library.findByAuthor(name);

        if (!authorBooks.isEmpty()) {
            System.out.println("Книги запрашиваемого автора:");
            authorBooks.forEach(book -> {
                System.out.println(book.getBookTitle());
                String jsonString = new Gson().toJson(book);
                System.out.println(jsonString);
            });
        } else {
            System.out.println("Книги данного автора не найдены");
        }

    }
}
