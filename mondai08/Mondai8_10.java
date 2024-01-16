import java.util.*;
public class Mondai8_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); //Scannerをインスタンス化
        List<Integer> list = new ArrayList<>(); // ArrayListのインスタンス化
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6); list.add(7); list.add(8); list.add(9); list.add(10);  //要素を追加
        System.out.print("削除するインデックス番号を入力してください：");   
        int deletenum = stdIn.nextInt();    //インデックス番号をintで入力させる
        int size = list.size(); //listのサイズをsizeに代入
        if (deletenum > size-1 || 0 > deletenum){// もしdeletenumがインデックス番号より大きいか小さかったら
            System.out.println("インデックス番号が不正です。再入力してください。");}
        else{   // それ以外なら
            list.remove(deletenum); //  list(deletenum)を削除
            System.out.println("削除後の整数値配列=" + list);   // 結果を出力
            
        }
    stdIn.close();
    }
    
}
