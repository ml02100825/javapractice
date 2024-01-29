package Mondai04_07;
import java.util.*;
public class Mondai04_07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("１つ目の文字："); String str = stdIn.next();
        System.out.print("２つ目の文字："); String str2 = stdIn.next();
        str = str.intern();
        str2 = str2.intern();
        if (str == str2){
            System.out.println("同じ文字です");
        }
        else{
            System.out.println("異なる文字です");
        }
    }
}
