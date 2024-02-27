public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор","Достоевский");
        Author author2 = new Author("Николай","Гоголь");
        Book book1 = new Book("Преступление и наказание",author1,1866);
        Book book2 = new Book("Мертвые души",author2,1842);
        book2.setYearPublication(1843);
    }
}

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}