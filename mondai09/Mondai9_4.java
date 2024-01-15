import java.util.Scanner;
public class Mondai9_4 {
    static int answer(int number){
            number = number * 3;
            return number;
    }
    static int trueanswer(int num){
            
            int number;
            number = answer(num);
            number = number *3;
            return number;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        int answer;
        answer = trueanswer(num);
        System.out.println(num + "の9倍は" + answer + "です。");
        stdIn.close();

    }
}
