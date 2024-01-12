import java.util.Scanner;
public class Mondai6_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("入力文字列：");
        String str = stdIn.next();
        int len;
        len = str.length();
        for(int i = 0; i < len; i++)
            System.out.println(str.charAt(i));
        stdIn.close();
    }
}
