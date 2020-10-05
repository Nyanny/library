
public class LibraryFactory {
    private static final Library library = new Library();
    private static final Book book1 = new Book();
    private static final Book book2 = new Book();
    private static final Book book3 = new Book();
    private static final Book book4 = new Book();
    private static final Book book5 = new Book();
    private static final Book book6 = new Book();

    private static final Author pushkin = new Author();
    private static final Author tolstoyLev = new Author();
    private static final Author lovecraft = new Author();



    private void createExample(){

        pushkin.setName("Александр Пушкин");
        pushkin.setBirthday(1799);
        tolstoyLev.setName("Лев Толстой");
        tolstoyLev.setBirthday(1828);
        lovecraft.setName("Говард Лавкрафт");
        tolstoyLev.setBirthday(1890);

        book1.setBookTitle("Дубровский");
        book1.setAuthor(pushkin);
        book1.setPublishedDate(1841 );
        book2.setBookTitle("Евгений Онегин");
        book2.setAuthor(pushkin);
        book3.setBookTitle("Зов Ктулху");
        book3.setAuthor(lovecraft);
        book4.setBookTitle("Война и мир");
        book4.setAuthor(tolstoyLev);
        book5.setBookTitle("Капитанская дочка");
        book5.setAuthor(pushkin);
        book6.setBookTitle("Анна Каренина");
        book6.setAuthor(tolstoyLev);

        library.putBook(book1.getBookTitle(),book1);
        library.putBook(book2.getBookTitle(),book2);
        library.putBook(book3.getBookTitle(), book3);
        library.putBook(book4.getBookTitle(), book4);
        library.putBook(book5.getBookTitle(), book5);
        library.putBook(book6.getBookTitle(), book6);
    }

    public Library crateLibrary(){
        createExample();
        return library;
//        return new Library();
    }
}
