package Mondai03_17;
import java.util.*;
public class Mondai03_17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("台形の面積を求めます");
        System.out.print("上底の長さ："); int upper_bottom = stdIn.nextInt();
        System.out.print("下底の長さ"); int bottom = stdIn.nextInt();
        System.out.print("高さ："); int height = stdIn.nextInt();
        double area = ((double)upper_bottom + (double)bottom) * (double)height / 2;
        System.out.println("台形の面積 = " + area);
    }
}
