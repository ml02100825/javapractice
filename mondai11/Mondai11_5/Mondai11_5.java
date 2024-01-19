package Mondai11_5;
import java.util.*;
public class Mondai11_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        String name = stdIn.next();
        System.out.print("年齢を入力してください：");
        int age = stdIn.nextInt();
        System.out.print("性別を入力してください：");
        String gender = stdIn.next();
        System.out.print("身長(cm)を入力してください：");
        double height = stdIn.nextDouble();
        System.out.print("体重(kg)を入力してください：");
        double weight = stdIn.nextDouble();
        Person person = new Person(name, age, gender, height, weight);
        person.disp_info();
        double bmi = person.get_bmi();
        System.out.println("BMI値 =" + (Math.floor(bmi * 1000)/1000));
        String obestily = person.get_obestily();
        System.out.println("肥満度判定 ＝" + obestily);
        double suitable = person.get_suitable_weight();
        System.out.println("適正体重 ＝" +(Math.floor(suitable * 1000)/1000));
    
}
}