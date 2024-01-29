package Mondai03_20;

public class Mondai03_20 {
    public static void main(String[] args) {
        int hamburger = 450;
        int shake = 200;
        int cola = 100;
        int sum = hamburger + shake + cola;
        double tax_rate = 0.1;
        double tax = (double) sum * tax_rate;
        int chip = 120;
        int taxsum = sum + (int)tax + chip;
        System.out.println("ハンバーガー：" + hamburger);
        System.out.println("シェイク：" + shake);
        System.out.println("コーラ：" + cola);
        System.out.println("合計額（税抜）" + sum);
        System.out.println("消費税：" + (int)tax);
        System.out.println("チップ：" + chip);
        System.out.println("合計額（税込）" + taxsum);

    }
}
