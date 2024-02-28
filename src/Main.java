public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор","Достоевский");
        Author author2 = new Author("Николай","Гоголь");
        Book book1 = new Book("Преступление и наказание",author1,1866);
        Book book2 = new Book("Мертвые души",author2,1842);
        book2.setYearPublication(1843);
    }
}