public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги = " + this.title + "   " + this.author + "     Год издания = " + this.year;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return title.equals(book.title) && year == book.year && author.equals(book.author);
    }

    public int hasCode() {
        return java.util.Objects.hash(title, author, year);
    }

}
