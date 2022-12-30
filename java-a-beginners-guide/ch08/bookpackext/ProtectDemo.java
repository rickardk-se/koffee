package bookpackext;

class ExtBook extends bookp2.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title=title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author=author;}
    public int getPubDate() {return pubDate;}
    public void setPubDate(int pubDate) {this.pubDate=pubDate;}
}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java1", "A1", 2022, "MCH");
        books[1] = new ExtBook("Java2", "A2", 2022, "MCH");
        books[2] = new ExtBook("Java3", "A3", 2022, "MCH");
        books[3] = new ExtBook("Java4", "A3", 2022, "MCH");
        books[4] = new ExtBook("Java5", "A3", 2022, "MCH");

        for(int i=0; i < books.length; i++){
            System.out.println(books[i].getTitle());
        }
    }
}