package Mondai11_6;

import java.util.*;
public class Mondai11_6 {
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
        System.out.println("---------------データの更新----------------");
        System.out.print("更新後の年齢を入力してください：");
        age = stdIn.nextInt();
        person.set_age(age);
        System.out.println("更新後の身長を入力してください：");
        height = stdIn.nextDouble();
        person.set_height(height);
        System.out.println("更新後の体重を入力してください：");
        weight = stdIn.nextDouble();
        person.set_weight(weight);
        person.disp_info();
        double newbmi = person.get_bmi();
        System.out.println("BMI値 =" + (Math.floor(newbmi * 1000)/1000));
        String newobestily = person.get_obestily();
        System.out.print("肥満度判定 ＝" + newobestily);
        double newsuitable = person.get_suitable_weight();
        System.out.print("適正体重 ＝" +(Math.floor(newsuitable * 1000)/1000));
    
}
}