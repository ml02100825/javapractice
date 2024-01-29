package Mondai15_02;
import java.util.*;
class Mondai15_02{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
            // 整数の入力を促す
            System.out.print("整数を入力 ＝ ");
            // 整数の入力
            int num = stdIn.nextInt();
            // もし偶数だったら
            if (num % 2 == 0){
                System.out.println("偶数です。");
            }
            //  もし奇数だったら
            else{
                System.out.println("奇数です");
            }
            // 整数以外が入力されたら
            } catch (InputMismatchException e){
        System.out.println("整数と認識できません！！");
    }
    }
}