import java.util.Scanner;

public class Mondai11_1 {
        public static void main(String[] args) {
            
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        int radius = stdIn.nextInt();
        Circle calculation = new Circle(radius);
        double area = calculation.circlearea();
        double ference = calculation.circumference();
        System.out.println("円周の長さは"+ ference+ "です。");
        System.out.println("円の面積は"+(Math.floor(area * 1000)/1000)+ "です。");
        }
    
}
