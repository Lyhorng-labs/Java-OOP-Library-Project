package models;

public class StudentUser extends User{
    private String major;

    public StudentUser(String name, int id, String major ){
        super(name, id);
        this.major=major;
    }
    public String getMajor(){
        return major;
    }
    @Override
    public int getBorrowLimit(){
        return 5;
    }

}

