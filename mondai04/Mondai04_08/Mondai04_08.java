package Mondai04_08;
import java.util.*;
public class Mondai04_08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0～100 までの得点（整数値）を 2 つ入力してください");
        System.out.print("1つ目の得点："); int point = stdIn.nextInt();
        System.out.print("2つ目の得点："); int score = stdIn.nextInt();
        if (point >= 60 && score >= 60)
            System.out.println("合格です");
        else{
            System.out.println("不合格です");
        }
    }
}
