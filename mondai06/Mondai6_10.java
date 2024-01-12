import java.util.Scanner;
public class Mondai6_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("直角三角形を描画します。");
        System.out.println("2~20までの整数値を入力してください。");
        System.out.print("底辺の長さを入力：");
        int base = stdIn.nextInt();
        if (base<=1 || base>20)
            System.out.println("値が正しくありません。");
        else    
            for (int i = 1; i <= base; i++){
                for (int j =1 ; j <= i ; j++)
                    System.out.print("*");
                System.out.println();
            }
        stdIn.close();
    }
}
