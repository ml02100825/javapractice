import java.util.Scanner;
class Mondai5_1{
   
    public static void main(String[] args) {
        Scanner sdtIn = new Scanner(System.in);
        System.out.print("A~Dの値を入力してください：");
        String rank = sdtIn.next();
        switch (rank) {
            case "A":
                System.out.println("ランクAは評価「優」です");
                break;
            case "B":
                System.out.println("ランクBは評価「良」です");
                break;
            case "C":
                System.out.println("ランクCは評価「可」です");
                break;
            case "D":
                System.out.println("ランクDは評価「不可」です");

                break;
        
        }
    sdtIn.close();
    }
}