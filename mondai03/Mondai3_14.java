import java.util.Scanner;
public class Mondai3_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
       System.out.println("長方形の面積を求めます");
       System.out.print("縦の長さ：");
       double vertical = stdIn.nextDouble();
       System.out.print("横の長さ："); 
       double horizontal = stdIn.nextDouble();
       double area = vertical * horizontal;
       System.out.println("長方形の面積 = " + area);
       stdIn.close();
    }
    
}
