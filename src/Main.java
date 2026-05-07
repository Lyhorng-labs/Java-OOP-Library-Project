import models.*;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library myLibrary= new Library();
        Scanner input= new Scanner(System.in);
        boolean running= true;

        System.out.println("==== Welcome to the Library System ====");

        while (running){
            System.out.println("What would you like to do?");
            System.out.println("1. Add a Book");
            System.out.println("2. Register a User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return book");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice= getInput(input);

            switch (choice){
                case 1:
                    System.out.print("Enter a book title: ");
                    String title= input.nextLine();
                    System.out.print("Enter the author(s): ");
                    String author= input.nextLine();

                    Category.displayCategories();
                    System.out.print("Select a number: ");
                    int num= getInput(input);

                    Category[] type= Category.values();
                    if (num >0 && num <= type.length){
                        Category selected= type[num-1];
                        myLibrary.addBook(new Book(title, author, selected));
                        System.out.println("Successfully added");
                    }else{
                        System.out.println("Invalid choice. Book not added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name= input.nextLine();
                    System.out.print("Enter ID: ");
                    int id= getInput(input);

                    System.out.print("Select User type: 1. Student | 2. Teacher");
                    int kind=getInput(input);
                    if (kind==1){
                        System.out.print("Enter Major: ");
                        String major = input.nextLine();
                        myLibrary.addUser(new StudentUser(name, id, major));
                        System.out.println("Student registered");
                    }else if (kind ==2){
                        System.out.print("Enter the Department: ");
                        String department= input.nextLine();
                        myLibrary.addUser(new TeacherUser(name, id, department));
                        System.out.println("Teacher registered");
                    }else {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int borrowUserID= getInput(input);
                    User userID= myLibrary.searchUser(borrowUserID);

                    if(userID!=null){
                        System.out.print("Enter book title: ");
                        String title_borrow=input.nextLine();
                        myLibrary.borrowItem(userID, title_borrow);
                    }else{
                        System.out.println("User ID " + borrowUserID + " is not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    int returnUserID= getInput(input);
                    User returnID= myLibrary.searchUser(returnUserID);
                    if (returnID!=null){
                        System.out.print("Enter book title to return: ");
                        String title_return=input.nextLine();
                        myLibrary.returnItem(returnID, title_return);
                    }else{
                        System.out.println("User ID " + returnID + " is not found.");
                    }
                    break;
                case 5:
                    myLibrary.displayBook();
                    break;
                case 6:
                    System.out.println("Exiting system... Goodbye!");
                    running=false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }
    }
    public static int getInput(Scanner input){
        while (true){
            try{
                return Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.print("\nInvalid input, Please enter a valid number: ");
            }
        }
    }

}