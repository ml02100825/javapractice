package Mondai02_04;
public class Mondai02_04 {
    public static void main(String[] args) {
        String num1 = "1010";
        int conversion1 = Integer.parseInt(num1, 2);    // 後ろの2で進数を設定
        System.out.println(conversion1);
        String num2 = "12";
        int conversion2 = Integer.parseInt(num2, 8);
        System.out.println(conversion2);
        String num3 = "A";
        int conversinon3 = Integer.parseInt(num3, 16);
        System.out.println(conversinon3);
    }
}
