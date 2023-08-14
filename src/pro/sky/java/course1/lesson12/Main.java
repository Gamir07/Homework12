package pro.sky.java.course1.lesson12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "London");
        Author author2 = new Author("William S", "Maugham");
        Book book1 = new Book("Martin Iden", author1, 1913);
        Book book2 = new Book("Of Human Bondage", author2, 1913);

        book2.setPublicationYear(1915);

    }
}
