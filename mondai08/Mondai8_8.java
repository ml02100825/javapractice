import java.util.*;
public class Mondai8_8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // ArrayListのインスタンス化
        Scanner stdIn = new Scanner(System.in); // Scannerのインスタンス化
        System.out.println("整数値を３つ入力してください"); //三つの整数値の入力を求める
        System.out.print("１つ目の整数値：");   //  一つ目の整数値の入力を求める
        int firstnum = stdIn.nextInt(); //  firstnumを入力
        System.out.print("２つ目の整数値：");   //  二つ目の整数値の入力を求める
        int secondnum = stdIn.nextInt(); // secondnumを入力
        System.out.print("３つ目の整数値：");   //  三つ目の整数値の入力を求める
        int thirdnum = stdIn.nextInt(); //  thirdnumを入力
        list.add(firstnum); list.add(secondnum); list.add(thirdnum);    // listに入力された整数値を追加
        int size = list.size(); //  listのsizeをsizeに代入
        int max = list.get(0);  //  maxにlistの先頭を代入
        int min = list.get(0);  //  minにlistの先頭を代入
        for (int i = 0; i < size; i++){ // forでlistのsizeの回数ループさせる
            if (max < list.get(i))  //  もしmaxがlist(i)よりちいさければ
                max = list.get(i);  //  maxにlist(i)を代入
            else if (min > list.get(i))// もしminがlist(i)大きければ
                min =list.get(i);   //  minにlist(i)を代入
    }
    System.out.println("最大値：" + max);   //結果を出力
    System.out.println("最小値：" + min);   //結果を出力
    stdIn.close();  //閉じないと警告が出るの閉じる
        
            
    }
    
}
