import java.util.Scanner;

public class Mondai11_3 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        CLcalculation answer =new CLcalculation(x, y);
        int sum = answer.getsum();
        System.out.println(answer.getx() + "から"+ answer.gety() + "の合計値は"+ sum + "です。" );

    }
}
