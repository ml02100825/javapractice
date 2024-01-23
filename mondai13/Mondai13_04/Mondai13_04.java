package Mondai13_04;
import java.util.Scanner;
public class Mondai13_04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1個目の整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.print("2個目の整数を入力してください：");
        int y = stdIn.nextInt();
        CalcExcuter excuter = new CalcExcuter();
        excuter.dispAdd(x, y);
        excuter.dispSub(x, y);
        excuter.dispMulti(x, y);
        excuter.dispDiv(x, y);
    }
}
