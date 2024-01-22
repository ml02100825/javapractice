package Mondai12_03;
import java.util.*;
public class Bird extends Animal{
    Bird(String name, int length){
        super(name, length);
    }
    @Override public void move(){
        System.out.println(name + "は" + length + "メートル飛びました。");
    }
    
}
