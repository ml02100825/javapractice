package Mondai04_16;
import java.util.*;
public class Mondai04_16 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        System.out.print("0～100 までの国語の得点（整数値）を入力してください:"); int japanese = stdIn.nextInt();
        if (japanese >= 80){
            System.out.print("0～100 までの数学の得点（整数値）を入力してください"); int math = stdIn.nextInt();
            if (math >= 80){
                System.out.println("合格です");
            }
            else{
                System.out.println("不合格です");
            }
        }
    }
}
