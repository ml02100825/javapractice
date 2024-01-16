import java.util.*;
public class Mondai8_9 {
    public static void main(String[] args) {
        
    List<Integer> list1 = new ArrayList<>();    //ArrayListをインスタンス化
        
        list1.add(10); list1.add(20); list1.add(30); list1.add(40); list1.add(50); //list1に要素を追加
        List<Integer> list2 = new ArrayList<>(); //ArrayListをインスタンス化
        list2.add(22); list2.add(33); list2.add(44); list2.add(55); list2.add(66);  //list2に要素を追加
        List<Integer> sumlist = new ArrayList<>();  //  ArrayListをインスタンス化
        int size = list1.size();    //sizeにlist1のサイズを代入
        for (int i = 0; i < size; i++){ // sizeの回数ループする
            int sum = 0;    //  sumlistに追加する変数sumを定義
            sum = (list1.get(i) + list2.get(i));    //　sumlistに追加するsumを求める
            sumlist.add(sum);   // sumlistにsumを追加する
        }
        System.out.println("list_a = " + list1);    // 結果を出力
        System.out.println("list_b = " + list2);    // 結果を出力
        System.out.println("list_a + list_b = " + sumlist); // 結果を出力
           

    }
    
}
