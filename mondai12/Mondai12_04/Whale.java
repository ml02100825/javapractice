package Mondai12_04;
import java.util.*;
public class Whale extends Animal{
    Whale(String name, int length, String food){
        super(name, length, food);
    }
    @Override public void move(){
        System.out.println(this.name + "は" + this.length + "キロメートル泳ぎました。");
    }
    
    @Override public void eat(){
        System.out.println(this.name + "は" + this.food + "を食べました。");
    }
}
