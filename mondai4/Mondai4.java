import java.util.Scanner;
public class Mondai4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0~100までの得点(整数値)を2つ入力してください");
            System.out.print("国語の得点：");
            int kokugo = stdIn.nextInt();
            System.out.print("英語の得点：");
            int english = stdIn.nextInt();
            stdIn.close();
            if (kokugo >=80 && english >= 80)
            System.out.println("２科目とも合格です。");
    }
}

