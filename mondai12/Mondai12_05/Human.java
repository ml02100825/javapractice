package Mondai12_05;

public class Human extends Animal{
    Human(String name, int length, String food){
        super(name, length, food);
    }
    public void move(){
        System.out.println(name + "は" + length + "メートル歩きました。");
    }
    
    public void eat(){
        System.out.println(name + "は" + food + "を食べました。");
    }
    
}
