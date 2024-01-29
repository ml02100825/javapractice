package Mondai03_18;
import java.util.*;
public class Mondai03_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("税込み価格を求めます");
        System.out.print("定価："); int list_price = stdIn.nextInt();
        System.out.print("消費税率："); double tax_rate = stdIn.nextDouble();
        double tax = tax_rate /100 + 1 ;
        double price = list_price * tax;
        System.out.println("定価 = " + list_price);
        System.out.println("税率 = " + Math.round(tax_rate));
        System.out.println("税込み価格 = " + Math.round(price));
    }
    
}
