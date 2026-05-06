//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library myLibrary= new Library();
        // 1. System Initialization with different Book types
        System.out.println("---- System Initialization ----");

        // Using the new Category Enum and Subclasses
        Book b1 = new Book("Fly me to the moon", "Kenjiro Hata", Category.ROMANCE);
        EBook b2 = new EBook("Java Programming", "John Smith", Category.TECH, 15.5);
        AudioBook b3 = new AudioBook("The Great Gatsby", "F. Scott Fitzgerald", Category.CLASSIC, 180);

        // Using StudentUser because User is now abstract
        StudentUser user1 = new StudentUser("Kon Jruk", 102);
        TeacherUser user2 = new TeacherUser("Mr. Herbert", 501, "English");

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);
        myLibrary.addUser(user1);
        myLibrary.addUser(user2);

        myLibrary.displayBook();

        // 2. Testing Borrowing (Normal Case)
        System.out.println("\n---- Testing Borrowing ----");
        myLibrary.borrowItem(user1, "Fly me to the moon");

        // 3. Testing Edge Cases (Book not found & Already borrowed)
        System.out.println("\n---- Testing Edge Case ----");
        myLibrary.borrowItem(user1, "One Piece"); // Should say not found
        myLibrary.borrowItem(user2, "Fly me to the moon"); // Should say already borrowed

        myLibrary.displayBook();

        // 4. Testing Return
        System.out.println("\n---- Testing Return ----");
        myLibrary.returnItem(user1, "Fly me to the moon");

        // 5. Final Inventory Check
        System.out.println("\n---- Final Inventory Check ----");
        myLibrary.displayBook();
    }
}