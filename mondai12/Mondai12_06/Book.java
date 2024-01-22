package Mondai12_06;

public class Book {
    static int counter;
    String title;
    String auther;
    int price;
    int id;
    Book(String title, String auther, int price){
        this.title = title;
        this.auther = auther;
        this.price = price;
    }
    public int gatCounter(){
        counter += 1;
        return counter;
    }
    public void dispinfo(){}
}
