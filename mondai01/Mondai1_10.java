import java.util.Scanner;
public class Mondai1_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字の入力：");
        String str = stdIn.nextLine();
        System.out.print("整数の入力：");
        int num = stdIn.nextInt();
        System.out.print("小数の入力：");
        double number = stdIn.nextDouble();
        stdIn.close();
        System.out.println("入力された文字 ＝" + str);
        System.out.println("入力された整数 ＝" + num);
        System.out.println("入力された小数 ＝" + number);
    }
    
}
