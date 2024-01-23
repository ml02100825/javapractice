package Mondai12_03;
import java.util.*;
public class Whale extends Animal{
    Whale(String name, int length){
        super(name, length);
    }
    @Override public void move(){
        System.out.println(this.name + "は" + this.length + "キロメートル泳ぎました。");
    }
    
}
