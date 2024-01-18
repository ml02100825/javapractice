
import java.util.Scanner;
public class Monda11_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        Calculation answer =new Calculation(x, y);
        int sum = answer.getsum();
        System.out.println(x + "から"+ y + "の合計値は"+ sum + "です。" );

    }
}
