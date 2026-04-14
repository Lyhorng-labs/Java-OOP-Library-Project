import java.util.ArrayList;
public class User {
    private String name;
    private int id;
    private ArrayList<Book> borrowbook;

    public User(String name, int id){
        this.name=name;
        this.id=id;
        this.borrowbook=new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public ArrayList<Book> getBorrowbook(){
        return borrowbook;
    }

    public void borrowBook(Book book){
        if (book.isAvailable()){
            borrowbook.add(book);
            book.setAvailable(false);
            System.out.println(name + " borrowed " + book.getTitle() + ".");
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
    public void returnBook(Book book){
        if (borrowbook.contains(book)){
            borrowbook.remove(book);
            book.setAvailable(true);
            System.out.println("User: " + name + " returned " + book.getTitle() + ".");
        }else{
            System.out.println("User: " + name + " does not have this book in their borrow list.");
        }
    }
    @Override
    public String toString(){
        return "User: " + name + " (ID: " + id + ") has " + borrowbook.size() + " books.";
    }
}
