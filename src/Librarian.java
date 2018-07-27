import java.util.ArrayList;

public class Librarian extends Person {

    private double salary;

    public Librarian(long id, long phone, String name, String address, String email, String gender, double salary) {
        super(id, phone, name, address, email, gender);
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int  searchInLibrary(ArrayList<Book> books ,String bookName)
    {
        for(int i = 0;i<books.size();++i)
        {
            Book book = books.get(i);
            if(book.getBookName().equals(bookName))
            {
                return book.getId();
            }
        }

        return -1;   //not found
    }
}
