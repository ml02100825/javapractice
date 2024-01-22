package Mondai12_03;
import java.util.*;
public class Mondai12_03 {
    public static void main(String[] args) {
  
        Dog dog = new Dog("犬", 10);
        Bird bird = new Bird("鳥", 1000);
        Whale whale = new Whale("鯨", 50);
        dog.move();
        bird.move();
        whale.move();
    }
}
