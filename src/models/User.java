package models;

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
    public void borrowBook(Book book) {
        if (borrowbook.size() >= getBorrowLimit()) {
            System.out.println("Limit reached! you can only borrow " + getBorrowLimit() + " books.");
        } else if (!book.isAvailable()) {
            System.out.println(book.getTitle() + " is already checked out.");
        } else {
            borrowbook.add(book);
            book.setAvailable(false);
            System.out.println(getName() + " successfully borrowed " + book.getTitle());
        }
    }


    public void returnBook(Book book) {
        if (borrowbook.contains(book)) {
            borrowbook.remove(book);
            book.setAvailable(true);
            System.out.println(getName() + " returned " + book.getTitle());
        }
    }

    public String toString(){
        return "models.User: " + name + " (ID: " + id + ") has " + borrowbook.size() + " books.";
    }
}
