package Mondai12_03;
import java.util.*;
public class Dog extends Animal{
    Dog(String name, int length){
        super(name, length);
    }
    @Override public void move(){

        System.out.println(this.name + "は" + this.length + "メートル走りました。");
    }
    
}
