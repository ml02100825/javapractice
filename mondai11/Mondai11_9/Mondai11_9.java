package Mondai11_9;
import java.util.*;
public class Mondai11_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Carinfo car1 = new Carinfo("RX-7", "MAZDA", 5000000);
        car1.storing();
        Carinfo car2 = new Carinfo("RX-8", "MAZDA", 8000000);
        car2.storing();
        Carinfo car3 = new Carinfo("GT-R R34", "NISSAN", 10000000);
        car3.storing();
        System.out.print("検索するキーワード：");
        String keyword = stdIn.next();
        if (car1.al.contains(keyword) == true){
            System.out.println("車名：" + car1.carname);
            System.out.println("メーカー名：" + car1.makername);
            System.out.println("価格：" + car1.price);
        }
        else{
            if (car2.al.contains(keyword) == true){
            System.out.println("車名：" + car2.carname);
            System.out.println("メーカー名：" + car2.makername);
            System.out.println("価格：" + car2.price);
            }
            else{
                if (car3.al.contains(keyword) == true){
                System.out.println("車名：" + car3.carname);
                System.out.println("メーカー名：" + car3.makername);
                System.out.println("価格：" + car3.price);
                }
                else{
                    System.out.println("検索結果 0件");
                    System.out.println("検索条件を変えてください");

                }

            }

        }    
        

    }
}
