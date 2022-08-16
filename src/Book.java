public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //return title.compareTo(o.getTitle());
        return Integer.compare(numberOfPages, o.getNumberOfPages());
    }


}
