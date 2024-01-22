package Mondai12_04;
import java.util.*;
public class Mondai12_04 {
    public static void main(String[] args) {
  
        Dog dog = new Dog("犬", 10, "お肉");
        Bird bird = new Bird("鳥", 1000, "虫");
        Whale whale = new Whale("鯨", 50, "オキアミ");
        dog.move();
        dog.eat();
        bird.move();
        bird.eat();
        whale.move();
        whale.eat();

    }
}
