public class Book {
    private String title;
    private String author;
    private String category;
    private boolean isAvailable;

    public Book(String title, String author, String category){
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

    public String getCategory(){
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
