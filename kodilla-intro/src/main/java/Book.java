public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book example = new Book();
        example.author = author;
        example.title = title;
        return example;
    }
}
