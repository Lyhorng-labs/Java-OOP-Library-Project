//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library myLibrary= new Library();

        Book b1 = new Book("Fly me to the moon", "Kenjiro Hata", "Romance");
        Book b2= new Book("More Than a Married Couple, But Not Lovers", "YuoKi Kanamaru", "Romance");
        Book b3= new Book("The Fragrant Flower Blooms with Dignity", "Saka Mikami", "Romance");

        User user1= new User("Kon Jruk", 1);

        System.out.println("---- System Initialization ----");
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addUser(user1);

        myLibrary.displayBook();
        System.out.println("---- Testing Borrowing ----");
        myLibrary.borrowItem(user1, "Fly me to the moon");

        System.out.println("\n---- Testing Edge Case ----");
        myLibrary.borrowItem(user1, "One Piece");
        myLibrary.borrowItem(user1, "fly me to the moon");

        myLibrary.displayBook();

        System.out.println("---- Testing Return ----");
        myLibrary.returnItem(user1, "Fly me to the moon");

        System.out.println("---- Final Inventory Check ----");
        myLibrary.displayBook();
    }
}