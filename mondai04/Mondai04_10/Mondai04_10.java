package Mondai04_10;
import java.util.*;
public class Mondai04_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("0～100 までの得点（整数値）を入力してください:"); int num = stdIn.nextInt();
        if (num > 100 || num < 0){
            System.out.println("入力値が不正です");
        }
        else{
            System.out.println("正しい入力値です");
        }
    }
}
