package Mondai14_03;
import java.util.*;
public class Mondai14_03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String str = stdIn.next();
        System.out.println("結果文字列：" + str.substring(0, 10));

    }
}
