package models;

public class TeacherUser extends User{
    private String department;

    public TeacherUser(String name, int id, String department){
        super(name, id);
        this.department= department;
    }

    public int getBorrowLimit(){
        return 10;
    }
    public String getDepartment(){
        return department;
    }
}
