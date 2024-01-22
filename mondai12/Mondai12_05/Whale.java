package Mondai12_05;
import java.util.*;
public class Whale extends Animal{
    Whale(String name, int length, String food){
        super(name, length, food);
    }
    public void move(){
        System.out.println(name + "は" + length + "キロメートル泳ぎました。");
    }
    
    public void eat(){
        System.out.println(name + "は" + food + "を食べました。");
    }
}
