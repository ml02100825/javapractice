package Mondai12_04;
import java.util.*;
public class Bird extends Animal{
    Bird(String name, int length, String food){
        super(name, length, food);
    }
    public void move(){
        System.out.println(name + "は" + length + "メートル飛びました。");
    }
    public void eat(){
        System.out.println(name + "は" + food + "を食べました。");
    }
}
