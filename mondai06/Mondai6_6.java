import java.util.Scanner;
public class Mondai6_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("開始数：");
        int start = stdIn.nextInt();
        System.out.print("終了数：");
        int end = stdIn.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += i;
        System.out.println("合 計：" + sum);
        stdIn.close();
    }
}
