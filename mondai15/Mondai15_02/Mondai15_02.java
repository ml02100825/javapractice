package Mondai15_02;
import java.util.*;
class Mondai15_02{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
        System.out.print("整数を入力 ＝ ");
        int num = stdIn.nextInt();
        if (num % 2 == 0){
            System.out.println("偶数です。");
        }
        else{
            System.out.println("奇数です");
        }
    } catch (InputMismatchException e){
        System.out.println("整数と認識できません！！");
    }
    }
}