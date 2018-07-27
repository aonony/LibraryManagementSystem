public class Book {
    private String bookName,authorName,category;
    private int numberOfCopies,id;

    public Book(String bookName, String authorName, String category, int numberOfCopies, int id) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
        this.numberOfCopies = numberOfCopies;
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void decreaseNumberOfCopies()
    {
        numberOfCopies--;
    }
}
