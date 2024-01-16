public class Mondai7_4 {
    public static void main(String[] args) {
        int sum = 0;    //合計値をいれるsumを設定
        int x = 0;  //1ずつ増えていく変数xを設定
        while (sum<100000){ //もしsumが100000未満なら
           
            x++;            // xを1ずつ増やす
            sum = sum + x;  //sumにxをプラスする
        }
    System.out.println("合計が100000を超えるnは" + x +"です" ); //結果を出力
    }
    
}
