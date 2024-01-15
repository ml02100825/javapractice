
import java.util.Scanner;
import java.util.*;
public class Mondai8_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        List<Integer> even_number = new ArrayList<>();
        List<Integer> odd_number = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + "件目：整数を入力＝");
            int num = stdIn.nextInt();

            if (num % 2 == 0){
                even_number.add(num);
            }

            else if (num % 2 == 1){
                odd_number.add(num);
            }
    }   
        stdIn.close();
        

        System.out.println("偶数値配列：" + even_number);
        System.out.println("奇数値配列：" + odd_number);
    }
}
