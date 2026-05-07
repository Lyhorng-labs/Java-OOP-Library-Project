package models;

public enum Category {
    ACTION, ROMANCE, FANTASY, MYSTERY, TECH, CLASSIC;

    public static void displayCategories(){
        Category[] type= Category.values();
        for (int i=0; i<type.length; i++){
            System.out.println((i+1) + ". " + type[i]);
        }
    }

}
