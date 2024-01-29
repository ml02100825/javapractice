package Mondai04_04;
import java.util.Scanner;
public class Mondai04_04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0～100 までの得点（整数値）を 2 つ入力してください ");
        System.out.print("１つ目の得点：");    int point = stdIn.nextInt();
        System.out.print("２つ目の得点："); int score = stdIn.nextInt();
        if (point >=80 || score >= 80)
            System.out.println("合格です");
    }
}
