package Mondai12_05;
import java.util.*;
public class Bird extends Animal{
    Bird(String name, int length, String food){
        super(name, length, food);
    }
    public void move(){
        System.out.println(this.name + "は" + this.length + "メートル飛びました。");
    }
    public void eat(){
        System.out.println(this.name + "は" + this.food + "を食べました。");
    }
}
