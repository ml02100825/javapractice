package Mondai04_14;
import java.util.*;
public class Mondai04_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1つ目の値："); int num = stdIn.nextInt();
        System.out.print("2つ目の値："); int number = stdIn.nextInt();
        if(num > number){
            System.out.println("大きい方の値は" + num + "です");
        }
        else if (num == number ){
            System.out.println("同じ値です。");
        }
        else{
            System.out.println("大きい方の値は" + number + "です");
        }
    }
}
