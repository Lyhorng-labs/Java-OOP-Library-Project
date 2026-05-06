package models;

public class EBook extends Book {
    private double fileSizeMB;
    public EBook(String title, String author, Category category, double fileSizeMB){
        super(title, author, category);
        this.fileSizeMB=fileSizeMB;
    }
    public String toString(){
        return super.toString() + " [Format: E-models.Book | Size: " + fileSizeMB + "MB]";
    }
}
