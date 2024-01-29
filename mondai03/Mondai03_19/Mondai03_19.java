package Mondai03_19;
import java.util.*;
public class Mondai03_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("身長(cm)："); int height = stdIn.nextInt();
        System.out.print("体重(kg)："); int weight = stdIn.nextInt();
        double mheight = (double)height / 100;
        double bmi = weight / (mheight * mheight);
        System.out.println("BMI値 = " + bmi);
    }
}
