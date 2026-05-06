import java.util.ArrayList;
public abstract class User implements Borrowable {
    private String name;
    private long id;
    protected ArrayList<Book> borrowbook;

    public User(String name, long id){
        this.name=name;
        this.id=id;
        this.borrowbook=new ArrayList<>();
    }
    public abstract int getBorrowLimit();
    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

    public String toString(){
        return "User: " + name + " (ID: " + id + ") has " + borrowbook.size() + " books.";
    }
}
