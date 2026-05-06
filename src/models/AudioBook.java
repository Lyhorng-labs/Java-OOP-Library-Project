package models;

public class AudioBook extends Book{
    private int duration;
    public AudioBook(String title, String author, Category category, int duration){
        super(title, author, category);
        this.duration=duration;
    }
    public String getFormattedDuration(){
        int hours= duration / 60;
        int mins= duration % 60;
        return hours + "h" + mins + "minute(s)";
    }
    public String toString(){
        return super.toString() + " [Format: Audio models.Book | Duration: " + getFormattedDuration() + "]";
    }
}
