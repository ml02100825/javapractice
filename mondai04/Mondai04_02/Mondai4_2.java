import java.util.Scanner;
public class Mondai4_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0~100までの得点を２つ入力してください");
        System.out.print("国語の得点：");
        int kokugo = stdIn.nextInt();
        System.out.print("英語の得点：");
        int english = stdIn.nextInt();
        stdIn.close();
        if (kokugo == 100 && english == 100)
            System.out.println("満点です。");
    }
}
