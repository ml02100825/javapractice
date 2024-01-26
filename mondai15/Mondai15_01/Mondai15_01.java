import java.util.Scanner;
class Mondai15_03{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
            System.out.print("整数1：");
            int num1 = stdIn.nextInt();
            System.out.print("整数2：");
            int num2 = stdIn.nextInt();
            double div = num1 / num2 ;
            System.out.println(num1 +" / " + num2 + " = " + div);
            } catch(ArithmeticException e){
                System.out.println("0による割り算です！！");
            }
        System.out.println("処理終了");
    }
    }
