public class Transaction {

    private String borrowDate,bookName,giveBackDate;

    public Transaction(String borrowDate, String bookName, String giveBackDate) {
        this.borrowDate = borrowDate;
        this.bookName = bookName;
        this.giveBackDate = giveBackDate;
    }


    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGiveBackDate() {
        return giveBackDate;
    }

    public void setGiveBackDate(String giveBackDate) {
        this.giveBackDate = giveBackDate;
    }
}
