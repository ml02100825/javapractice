package Mondai15_04;
import java.util.*;
public class Mondai15_04 {
    static boolean inValid(int n){
        return n != 0;
    }
    static double div(int num1, int num2) throws DividedByZero{
        if (! inValid(num2)) throw new DividedByZero(num2);
        double div = num1 / num2;
        return div;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
    try{
        System.out.print("数値１ ＝ ");
        int num1 = stdIn.nextInt();
        System.out.print("数値２ ＝ ");
        int num2 = stdIn.nextInt();
        System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
    } catch (ArithmeticException e){
        System.out.println("0で割りました！！");
    }
    
    }
}
