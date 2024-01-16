import java.util.*;
public class Mondai8_5 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)); //Integer型のListを作成  
        int size = list.size(); //listのサイズをsizeに代入
        int sum = 0;    //合計値をいれるsumを設定
        double average ;    //平均値をいれるaverageを設定

        for (int i = 0; i < size; i++){ // iがsize未満の間ループ
            sum = sum + list.get(i);    //list(i)をsumに足す
                }
        average = sum / size;   //上のループで求めたsumを使いavarageを求める
        System.out.println("合計値は" + sum + "です");  //結果を出力
        System.out.println("平均値は" + average + "です");  //結果を出力

    }
    
}
