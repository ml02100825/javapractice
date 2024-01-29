package Mondai03_15;
import java.util.*;
public class Mondai03_15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("三角形の面積を求めます");
        System.out.print("底辺の長さ："); int bottom = stdIn.nextInt();
        System.out.print("高さ："); int height = stdIn.nextInt();
        double area = (double) bottom * (double) height / 2;
        System.out.println("三角形の面積 = " + area);

    }
}
