package Mondai04_03;
import java.util.*;
public class Mondai04_03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0～100 までの得点（整数値）を 2 つ入力してください");
        System.out.print("国語の得点："); int japanese = stdIn.nextInt();
        System.out.print("英語の得点："); int english = stdIn.nextInt();
        if (japanese >=80 && english >= 80){
            System.out.println("2科目とも合格です");
        }
    }
}
