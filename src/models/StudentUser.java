package models;

public class StudentUser extends User{
    private int gradeLevel;

    public StudentUser(String name, int id){
        super(name, id);

    }

    @Override
    public int getBorrowLimit(){
        return 5;
    }

}

