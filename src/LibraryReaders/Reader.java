package LibraryReaders;
public class Reader {
    private String FirstnameSecondName; // ФИО
    private int NumberOfReaderTicket; // номер читательского билета
    private String Faculty; // факультет
    private String DateOfBirth; // дата рождения
    private String Phone; // телефон

    public Reader(String FirstnameSecondName, int NumberOfReaderTicket, String Faculty, String DateOfBirth, String Phone) {
        this.FirstnameSecondName = FirstnameSecondName;
        this.NumberOfReaderTicket = NumberOfReaderTicket;
        this.Faculty = Faculty;
        this.DateOfBirth = DateOfBirth;
        this.Phone = Phone;
    }

    public Reader() {
    }

    public String getFirstnameSecondName() {
        return FirstnameSecondName;
    }

    public int getNumberOfReaderTicket() {
        return NumberOfReaderTicket;
    }

    public void setNumberOfReaderTicket(int NumberOfReaderTicket) {
        this.NumberOfReaderTicket = NumberOfReaderTicket;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void takeBook(int number) {
        System.out.println(this.FirstnameSecondName + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.FirstnameSecondName + " взял 3 книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.FirstnameSecondName + " взял 3 книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.FirstnameSecondName + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.FirstnameSecondName + " вернул книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.FirstnameSecondName + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }
}