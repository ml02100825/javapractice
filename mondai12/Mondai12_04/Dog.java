package Mondai12_04;
import java.util.*;
public class Dog extends Animal{
    Dog(String name, int length, String food){
        super(name, length, food);
    }
    @Override public void move(){

        System.out.println(name + "は" + length + "メートル走りました。");
    }
    @Override public void eat(){
        System.out.println(name + "は" + food + "を食べました。");
    }
}
