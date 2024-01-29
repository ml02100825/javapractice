package Mondai03_16;
import java.util.*;
public class Mondai03_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("円の面積を求めます");
        System.out.print("半径："); int radius = stdIn.nextInt();
        final double PI = 3.14159;
        double area = radius * radius * PI ;
        System.out.println("円の面積 = " + area);
    }
}
