package Mondai12_03;
import java.util.*;
public class Whale extends Animal{
    Whale(String name, int length){
        super(name, length);
    }
    public void move(){
        System.out.println(name + "は" + length + "キロメートル泳ぎました。");
    }
    
}
