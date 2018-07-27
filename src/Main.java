import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int menuNum = 0;
    static Scanner scanner;
    static ArrayList<User> users;
    static ArrayList<Book> books;
    static ArrayList<Librarian> librarians;
    public static void main(String args[])
    {
        scanner = new Scanner(System.in);
        users = new ArrayList<>();
        books = new ArrayList<>();
        librarians = new ArrayList<>();
        menu(menuNum);

    }

    private static void menu(int menuNum)
    {
        switch (menuNum)
        {
            case 0:
                System.out.println("1-Add New User\n2-Enter New Book\n3-Add New Librarian\n0-Next Menu");
                int op = scanner.nextInt();
                if(op == 1)
                {
                    addUser();
                }
                else if(op == 2)
                {
                    enterBook();
                }
                else if (op == 0)
                {
                    menuNum++;
                    //menu(0);
                }
                else if (op == 3)
                {
                    addLibrarian();
                }
                menu(menuNum);
            break;

            case 1:
                System.out.println("1-Borrow Book\n2-Previous Menu\n0-Next Menu");
                op = scanner.nextInt();
                if(op == 1)
                {
                    System.out.println("Enter Your ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter Librarian ID");
                    int librarianID = scanner.nextInt();
                    System.out.println("Enter Book Name");
                    String bookName = scanner.next();
                    int bookID = librarians.get(librarianID).searchInLibrary(books,bookName);
                    books.get(bookID).decreaseNumberOfCopies();
                    users.get(id).borrowBook(new Transaction("01-07-2018",bookName,"01-08-2018"));
                }
                menu(menuNum);
            break;

        }
    }

    private static void addUser()
    {
        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("Enter Your Phone");
        long phone = scanner.nextLong();
        System.out.println("Enter Your Email");
        String email = scanner.next();
        System.out.println("Enter Your Address");
        String address = scanner.next();
        System.out.println("Enter Your Gender");
        String gender = scanner.next();
        int id = users.size();
        users.add(new User(id,phone,name,address,email,gender));
        System.out.printf("Your ID id %d\n",id);

    }

    private static void addLibrarian()
    {
        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("Enter Your Phone");
        long phone = scanner.nextLong();
        System.out.println("Enter Your Email");
        String email = scanner.next();
        System.out.println("Enter Your Address");
        String address = scanner.next();
        System.out.println("Enter Your Gender");
        String gender = scanner.next();
        System.out.println("Enter Your Experience");
        int experience = scanner.nextInt();
        int id = users.size();
        librarians.add(new Librarian(id,phone,name,address,email,gender,experience*1000));

    }

    private static void enterBook()
    {
        System.out.println("Enter Book Name");
        String bookName = scanner.next();
        System.out.println("Enter number Of Copies");
        int numberOfCopies = scanner.nextInt();
        System.out.println("Enter Author Name");
        String authorName = scanner.next();
        System.out.println("Enter category");
        String category = scanner.next();
        int id = users.size();
        books.add(new Book(bookName,authorName,category,numberOfCopies,id));
    }
}
