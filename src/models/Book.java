package models;

public class Book {
    private String title;
    private String author;
    private Category category;
    private boolean isAvailable;

    public Book(String title, String author, Category category){
        this.title=title;
        this.author=author;
        this.category=category;
        this.isAvailable=true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Category getCategory(){
        return category;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available){
        this.isAvailable=available;
    }

    @Override
    public String toString(){
        return title + " by " + author + " (" + category + ")";
    }
}
