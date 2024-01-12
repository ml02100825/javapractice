import java.util.Scanner;
public class Mondai5_2 {
    public static void main(String[] args) {
        Scanner sdtIn = new Scanner(System.in);
        System.out.print("クラス番号(1~3)の値を入力してください：");
        int classnumber = sdtIn.nextInt();
        
        switch (classnumber) {
            case 1:
                System.out.println("情報処理コース");
                break;
            case 2:
                System.out.println("OAビジネスコース");
                break;
            case 3:
                System.out.println("税理士コース");
                break;
        
            default:
                System.out.println("不正な入力です");
                break;
        }

    sdtIn.close();
    }
}
