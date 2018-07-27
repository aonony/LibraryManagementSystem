import java.util.ArrayList;

public class User extends Person {

    private String firstTransactionDate,lastTransactionDate;
    private ArrayList<Transaction> transactionsHistory;

    public User(long id, long phone, String name, String address, String email, String gender) {
        super(id, phone, name, address, email, gender);
        transactionsHistory = new ArrayList<>();
    }

    public String getFirstTransactionDate() {
        return firstTransactionDate;
    }

    public void setFirstTransactionDate(String firstTransactionDate) {
        this.firstTransactionDate = firstTransactionDate;
    }

    public String getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(String lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }


    public void borrowBook(Transaction transaction)
    {
        transactionsHistory.add(transaction);
    }



}
