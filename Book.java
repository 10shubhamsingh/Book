package Book;

public class Book {
    public String bookName;
    public String authorName;
    public int isbn;

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Book(String bookName, String authorName, int isbn){
        this.bookName=bookName;
        this.authorName=authorName;
        this.isbn=isbn;

    }
    @Override
    public String toString(){
        return "-----------------------\n"+
                "Book Name:\t" +getBookName()+"Author Name:\t"+getAuthorName()+"ISBN:\t"+getIsbn()+
    "\n---------------------------";
    }
}
