package bookpack;

class Book {
    private String title;
    private String author;
    private long isbn;

    Book(String t, String a, long i) {
        title = t;
        author = a;
        isbn = i;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public long getIsbn() {
        return isbn;
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book book1;
        Book book2;

        book1 = new Book("Effective Java", "Peter Robbins", 9783332234134L);
        book2 = new Book("Java is Easy", "James Gosling", 978333432143214L);

        System.out.println("You should read " + book1.getTitle());
        System.out.println("Then you should read " + book2.getTitle());
    }
}