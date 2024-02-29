public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор","Достоевский");
        Author author2 = new Author("Николай","Гоголь");
        Book book1 = new Book("Преступление и наказание",author1,1866);
        Book book3 = new Book("Преступление и наказание",author1,1866);
        Book book4 = new Book("Преступление и наказание",author1,1865); //Другой год
        Book book2 = new Book("Мертвые души",author2,1842);
        book2.setYearPublication(1843);
        System.out.println(author1.toString());
        System.out.println(book1.toString());
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));
        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());
    }
}