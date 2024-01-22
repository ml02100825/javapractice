package Mondai12_01;
import java.util.*;
class Mondai12_01{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.print("整数を入力してください：");
        int y = stdIn.nextInt();
        MoreCalc calc = new MoreCalc(x, y);
        System.out.printf("Sum %d and %d = %d \n", x, y, calc.calcSum());
        System.out.printf("Average %d and %d = %d \n", x, y, calc.calcAve());
        System.out.printf("Power %d of %d = %d \n", x, y, calc.calcPow());

    }
}