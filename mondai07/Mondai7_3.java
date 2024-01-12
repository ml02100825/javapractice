import java.util.Scanner;
public class Mondai7_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        do{
            System.out.print("整数値を入力：");
            x = stdIn.nextInt();
        }while (x<=0);
    while( x > 0){
        System.out.print(x % 10);
        x /= 10;
    }
    stdIn.close();
    }
}
