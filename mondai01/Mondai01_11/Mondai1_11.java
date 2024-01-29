import java.util.Scanner;
public class Mondai1_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("年：");
        int year = stdIn.nextInt();
        System.out.print("月：");
        int mouth = stdIn.nextInt();
        System.out.print("日：");
        int day = stdIn.nextInt();
        stdIn.close();
        System.out.println(year + "/" + mouth + "/" + day);
    }
}
