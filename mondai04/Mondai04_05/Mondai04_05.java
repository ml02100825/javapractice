package Mondai04_05;
import java.util.Scanner;
public class Mondai04_05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("0～100 までの得点（整数値）を入力してください:"); int score = stdIn.nextInt();
        if (score >= 60)
            System.out.println("合格です");
        else{
            System.out.println("不合格です");
        }
    }
}
