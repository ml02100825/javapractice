package Mondai04_15;
import java.util.*;
public class Mondai04_15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1つ目の整数値："); int num1 = stdIn.nextInt();
        System.out.print("2つ目の整数値："); int num2 = stdIn.nextInt();
        System.out.print("3つ目の整数値："); int num3 = stdIn.nextInt();
        if (num1 > num2  && num1 > num3){
            System.out.println("最大の値は" + num1 + "です");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("最大の値は" + num2 + "です");
        }
        else if (num1 == num2 && num1 == num3){
            System.out.println("全て同じ値です");
        }
        else{
            System.out.println("最大の値は" + num3 + "です");
        }
    }
}
