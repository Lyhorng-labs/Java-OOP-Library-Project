import java.util.ArrayList;
public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> allBooks;

    public Library(){
        this.allBooks = new ArrayList<>();
        this.users= new ArrayList<User>();
    }

    public void addBook(Book book){
        allBooks.add(book);
        System.out.println(book.getTitle() + " is added to the library.");
    }
    public void addUser(User user){
        users.add(user);
        System.out.println(user.getName() + " is added as a library user.");
    }

    public Book searchBook(String title){
        for (Book currentBook: allBooks){
            if (currentBook.getTitle().equalsIgnoreCase(title)){
                return currentBook;
            }
        }
        return null;
    }

    public void borrowItem(User user, String title){
        Book found= searchBook(title);
        if (found != null){
            user.borrowBook(found);
        }else {
            System.out.println("Book is not found!");
        }

    }

    public void returnItem(User user, String title) {
        Book found = searchBook(title);
        if (found == null) {
            System.out.println("Book is not found");
            return;
        }
        user.returnBook(found);
    }

    public void displayBook(){
        System.out.println("-----------------------------------");
        System.out.println("          Library Inventory        ");
        System.out.println("-----------------------------------");
        for (Book books : allBooks){
            String status= books.isAvailable()? "[Available]" : "[Checked out]";
            System.out.println(status + " " + books.getTitle());
        }
    }
}
