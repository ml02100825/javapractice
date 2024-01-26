package Mondai14_04;
import java.util.*;
public class Mondai14_04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列を二つ入力してください");
        System.out.print("１つ目の文字列を入力：");
        String str1 = stdIn.next();
        System.out.print("２つ目文字列を入力：");
        String str2 = stdIn.next();
        if (str1.equals(str2) == true){
            System.out.println("同じ文字列です");
        }
        else{
            System.out.println("違う文字列です。");
        }
    }
}
