import java.util.Scanner;
public class Mondai9_5 {
    static void calculation(int num1, int num2){
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
            System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num1 = stdIn.nextInt();
        System.out.print("整数を入力してください：");
        int num2 = stdIn.nextInt();
        calculation(num1, num2);
        stdIn.close();
    }
    
}
