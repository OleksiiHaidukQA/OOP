package LibraryReaders;
public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "Автотестирование на Java", "01.01.2022", "+380441234567");

        Reader[] reader = {reader1};

        Book book1 = new Book("Приключения", " No Credentials (Автор книги)");
        Book book2 = new Book("Словарь", " No Credentials (Автор книги)");
        Book book3 = new Book("Энциклопедия", " No Credentials (Автор книги)");
        Book[] books = {book1, book2, book3};

        printReader(reader);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения","Словарь","Энциклопедия");

        reader1.returnBook(3);
        reader1.returnBook("Приключения","Словарь","Энциклопедия");

    }

    private static void printBooks(Book[] books) {
    }

    private static void printReader(Reader[] reader) {
    }
}