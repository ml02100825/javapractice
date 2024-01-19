package Mondai11_8;
import java.util.*;
public class Mondai11_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        for (int i = 0; i < 3 ; i++){
            System.out.print("名前を入力してください：");
            String name = stdIn.next();
            System.out.print("年齢を入力してください：");
            int age = stdIn.nextInt();
            System.out.print("住所を入力してください：");
            String liveadress = stdIn.next();
            System.out.print("メールアドレスを入力してください：");
            String mailadress = stdIn.next();
            Person person = new Person(name, age, liveadress, mailadress);
            String decision =  person.check_age();
            String TF = person.check_mailadress();
            if (decision == "True" && TF == "True"){
                System.out.println("名前：" + name + "年齢：" + age + "住所：" + liveadress + "メールアドレス：" + mailadress + " 正常");
            }
            else{
            System.out.println("名前：" + name + "年齢：" + age + "住所：" + liveadress + "メールアドレス：" + mailadress + " 異常");
            }
        }
        }
        
    }
    

