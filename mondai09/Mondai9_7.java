import java.util.Scanner;
public class Mondai9_7 {
    static void scan(int num){
        int[] li = {4,10,59,679,1991,3994,6789,19324};
        String n = "False";
        for (int i = 0; i < li.length; i++){
            if (li[i] == num)
                n = "True";
        }
                
            
        if (n=="False")
            System.out.println(num + "は配列に含まれていません");
        else
            System.out.println(num + "は配列に含まれています");

    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        scan(num);
        stdIn.close();
    }

}
