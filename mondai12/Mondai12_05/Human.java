package Mondai12_05;

public class Human extends Animal{
    Human(String name, int length, String food){
        super(name, length, food);
    }
    public void move(){
        System.out.println(this.name + "は" + this.length + "メートル歩きました。");
    }
    
    public void eat(){
        System.out.println(this.name + "は" + this.food + "を食べました。");
    }
    
}
