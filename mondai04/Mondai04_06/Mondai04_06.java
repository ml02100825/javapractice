package Mondai04_06;
import java.util.*;
public class Mondai04_06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値を入力してください：");  int num = stdIn.nextInt();
        if (num % 2 == 0){
            System.out.println("偶数です");
        }
        else{
            System.out.println("奇数です");
        }
    }
}
