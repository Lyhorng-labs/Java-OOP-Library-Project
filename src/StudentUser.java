public class StudentUser extends User{
    private int gradeLevel;

    public StudentUser(String name, int id){
        super(name, id);

    }

    @Override
    public int getBorrowLimit(){
        return 5;
    }

    public void borrowBook(Book book) {
        if (borrowbook.size() >= getBorrowLimit()) {
            System.out.println("Limit reached! Students can only borrow " + getBorrowLimit() + " books.");
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

}

