import java.util.Scanner;
class Mondai1_9 {
   
   public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("お名前を入力してください＞");
    String str = stdIn.nextLine();
    stdIn.close();
    System.out.println("こんにちは"+ str + "さん！");
    
   } 
}
