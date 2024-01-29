package Mondai04_11;
import java.util.*;
public class Mondai04_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("数値 4 桁で西暦を入力してください:"); int year = stdIn.nextInt();
        if (year % 400 == 0){
            System.out.println("閏年です");
        }
        else if (year % 100 == 0){
            System.out.println("平年です");
        }
        else if (year % 4 == 0){
            System.out.println("閏年です");
        }
        else{
            System.out.println("平年です");
        }
    }
}
