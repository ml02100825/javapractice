import java.util.Scanner;
class Mondai15_01{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try{
            // 整数の入力を促す
            System.out.print("整数1：");
            // 整数を入力
            int num1 = stdIn.nextInt();
            // 整数の入力を促す
            System.out.print("整数2：");
            // 整数の入力
            int num2 = stdIn.nextInt();
            // 割り算の結果を代入
            double div = num1 / num2 ;
            // 結果を出力
            System.out.println(num1 +" / " + num2 + " = " + div);
            } catch(ArithmeticException e){ // 0による除算がされたら
                //  文章を出力
                System.out.println("0による割り算です！！");
            }
        System.out.println("処理終了");
    }
    }
